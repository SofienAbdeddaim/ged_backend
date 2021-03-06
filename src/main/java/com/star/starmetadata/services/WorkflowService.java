package com.star.starmetadata.services;
import com.star.starmetadata.entities.Person;
import com.star.starmetadata.repositories.PersonRepository;
import org.flowable.engine.*;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.engine.task.Event;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


@Service
public class WorkflowService {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private PersonRepository personRepository;

    public void startProcess(String asssignee) {
        Person person = personRepository.findByUsername(asssignee);

        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("person", person);
        runtimeService.startProcessInstanceByKey("emailArriver", variables);
    }

    public List<Task> getTasks(String assignee) {
        List<Task> tasks = taskService.createTaskQuery().list();
        List<Task> tasks1 = taskService.createTaskQuery().taskAssignee(assignee).list();
        List<Task> tasks2 = taskService.createTaskQuery().taskCandidateOrAssigned(assignee).list();



        Long tasks3 = taskService.createTaskQuery().count();

        return taskService.createTaskQuery().taskCandidateGroup(assignee).list();
    }

    public String taskDecision(Boolean aBoolean, String id) {
        Map<String, Object> variable = new HashMap<String, Object>();
        variable.put("approved", true);

        taskService.complete(id, variable, true);
        return id;
    }

//    that's for add a dummy user just momently
    public void createDemoUsers() {
        if (personRepository.findAll().size() == 0) {
            personRepository.save(new Person("jbarrez", "Joram", "Barrez", new Date()));
            personRepository.save(new Person("trademakers", "Tijs", "Rademakers", new Date()));
        }
    }

}
