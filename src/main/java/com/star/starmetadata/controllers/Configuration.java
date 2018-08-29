package com.star.starmetadata.controllers;

import com.star.starmetadata.entities.ConfigurationData;
import com.star.starmetadata.properties.AlfrescoFolder;
import com.star.starmetadata.services.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/configuration")
public class Configuration {

    @Autowired
    ConfigurationService configurationService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public AlfrescoFolder getConfiguration() {
//        in case we want save, edit and send configuration of root folder
//        return configurationService.getConfigurationData();
        return new AlfrescoFolder();
    }
}
