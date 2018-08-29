package com.star.starmetadata.services;

import com.star.starmetadata.entities.ConfigurationData;
import com.star.starmetadata.properties.AlfrescoFolder;
import com.star.starmetadata.repositories.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationService {

    @Autowired
    ConfigurationRepository configurationRepository;
//        in case we want save, edit and send configuration of root folder
//    public List<ConfigurationData> getConfigurationData() {
//        return configurationRepository.findAll();
//    }


}
