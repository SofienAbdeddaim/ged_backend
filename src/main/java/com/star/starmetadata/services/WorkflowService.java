package com.star.starmetadata.services;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkflowService {

    @Autowired
    ProcessEngineConfiguration cfg;

    ProcessEngine processEngine = cfg.buildProcessEngine();
}
