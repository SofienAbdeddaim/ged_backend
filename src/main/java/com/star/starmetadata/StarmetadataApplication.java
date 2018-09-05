package com.star.starmetadata;
import com.star.starmetadata.services.WorkflowService;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.flowable.engine.task.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StarmetadataApplication {

    public static void main(String[] args) {
        System.out.println("********************************************");
//        ProcessEngine processEngine = cfg.buildProcessEngine();
//        WorkflowService workflowService;
//        List<Event> events = workflowService.getTaskService();
        System.out.println("********************************************");
        SpringApplication.run(StarmetadataApplication.class, args);
    }

}
