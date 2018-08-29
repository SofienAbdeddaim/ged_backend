package com.star.starmetadata;

import com.star.starmetadata.repositories.MetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarmetadataApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarmetadataApplication.class, args);
    }
}
