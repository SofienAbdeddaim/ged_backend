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

//    Configuration of the flowable Engine
    @Bean
    public ProcessEngineConfiguration processEngineConfiguration() {
        return new StandaloneProcessEngineConfiguration()
                .setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/STAR_DB")
                .setJdbcUsername("postgres")
                .setJdbcPassword("1100")
                .setJdbcDriver("org.postgresql.Driver")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
    }

    public static void main(String[] args) {
        System.out.println("********************************************");
//        ProcessEngine processEngine = cfg.buildProcessEngine();
//        WorkflowService workflowService;
//        List<Event> events = workflowService.getTaskService();
        System.out.println("********************************************");
        SpringApplication.run(StarmetadataApplication.class, args);
    }

}
