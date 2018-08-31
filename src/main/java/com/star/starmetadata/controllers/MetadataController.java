package com.star.starmetadata.controllers;

import com.star.starmetadata.entities.Metadata;
import com.star.starmetadata.repositories.MetadataRepository;
import com.star.starmetadata.services.MetadataService;
import org.flowable.engine.ProcessEngineConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/metadata/")
public class MetadataController {

    @Autowired
    MetadataService metadataService;

    @Autowired
    ProcessEngineConfiguration cfg;

//    for add a metadata
    @RequestMapping(value = "/saveMetadata", method = RequestMethod.POST)
    public void save(@RequestBody Metadata metadata) {
        metadataService.saveMetadata(metadata);
    }

//    for update a metadata by id
    @RequestMapping(value = "/updateMetadata", method = RequestMethod.PUT)
    public void update(@RequestBody Metadata metadata) {
        metadataService.updateMetadata(metadata);
    }

//    for get a metadata
    @RequestMapping(value = "/getMetadataById/{metadataId}", method = RequestMethod.GET)
    public Metadata getById(@PathVariable("metadataId") Long id) {
       return metadataService.getMetadataById(id);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Metadata> getAll() {
        return metadataService.getAllMetadata();
    }
}
