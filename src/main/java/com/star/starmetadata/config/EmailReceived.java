package com.star.starmetadata.config;
import org.flowable.engine.*;
import org.flowable.engine.history.HistoricActivityInstance;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmailReceived {

//    public static void main(String[] args) {
//
//        ProcessEngine processEngine = cfg.buildProcessEngine();------------
//
//        RepositoryService repositoryService = processEngine.getRepositoryService();
//        Deployment deployment = repositoryService.createDeployment()
//                .addClasspathResource("Email_arriver.bpmn")
//
//                .deploy();----------------------------------------------------------------------------*************
//
//        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
//                .deploymentId(deployment.getId())
//                .singleResult();
//
//        System.out.println("Found process definition : " + processDefinition.getName());
//
////        -----------------------------collect data
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Who are you?");
//        String employee = scanner.nextLine();
//
//        System.out.println("How many holidays do you want to request?");
//        Integer nrOfHolidays = Integer.valueOf(scanner.nextLine());
//
//        System.out.println("Why do you need them?");
//        String description = scanner.nextLine();
//        //        /-----------------------------END******************************************************************
//
//        RuntimeService runtimeService = processEngine.getRuntimeService();
//
//        Map<String, Object> variables = new HashMap<String, Object>();
//        variables.put("employee", employee);
//        variables.put("nrOfHolidays", nrOfHolidays);
//        variables.put("description", description);
//
//        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("holidayRequest", variables);
//
//        TaskService taskService = processEngine.getTaskService();
//        List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("managers").list();
//        System.out.println("You have " + tasks.size() + " tasks:");
//        for (int i=0; i<tasks.size(); i++) {
//            System.out.println((i+1) + ") " + tasks.get(i).getName());
//        }
//
//        System.out.println("Which task would you like to complete?");
//        int taskIndex = Integer.valueOf(scanner.nextLine());
//        Task task = tasks.get(taskIndex - 1);

//        Map<String, Object> processVariables = taskService.getVariables(task.getId());
//        System.out.println(processVariables.get("employee") + " wants " +
//                processVariables.get("nrOfHolidays") + " of holidays. Do you approve this? ");
//
//        boolean approved = scanner.nextLine().toLowerCase().equals("y");
//        System.out.println(approved);
//        variables = new HashMap<String, Object>();
//        variables.put("approved", approved);
//        System.out.println(variables);
//        taskService.complete(task.getId(), variables);
//
//        HistoryService historyService = processEngine.getHistoryService();
//        List<HistoricActivityInstance> activities =
//                historyService.createHistoricActivityInstanceQuery()
//                        .processInstanceId(processInstance.getId())
//                        .finished()
//                        .orderByHistoricActivityInstanceEndTime().asc()
//                        .list();
//
//        for (HistoricActivityInstance activity : activities) {
//            System.out.println(activity.getActivityId() + " took "
//                    + activity.getDurationInMillis() + " milliseconds");
//        }
//
//    }
}
