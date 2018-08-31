package com.star.starmetadata;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarmetadataApplication {

    public static void main(String[] args) {
        System.out.println("********************************************");
//        ProcessEngine processEngine = cfg.buildProcessEngine();
        System.out.println("********************************************");
        SpringApplication.run(StarmetadataApplication.class, args);
    }

}
