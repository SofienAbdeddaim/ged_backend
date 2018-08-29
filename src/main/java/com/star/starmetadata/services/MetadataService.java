package com.star.starmetadata.services;

import com.star.starmetadata.entities.Metadata;
import com.star.starmetadata.repositories.MetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetadataService {

    @Autowired
    MetadataRepository metadataRepository;

    public void saveMetadata(Metadata metadata){
        metadataRepository.save(metadata);
    }

    public void updateMetadata(Metadata metadata) {
        metadataRepository.saveAndFlush(metadata);
    }

    public Metadata getMetadataById(Long id) {
        return metadataRepository.findById(id).get();
    }

    public List<Metadata> getAllMetadata() {
        return metadataRepository.findAll();
    }

}
