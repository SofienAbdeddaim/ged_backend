package com.star.starmetadata.services;

import com.star.starmetadata.entities.CourrierAr;
import com.star.starmetadata.repositories.CourrierArRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourrierArService {

    @Autowired
    CourrierArRepository courrierArRepository;

    public void saveCourrier(CourrierAr courrierAr) { courrierArRepository.save(courrierAr); }

    public void updateCourrier(CourrierAr courrierAr) { courrierArRepository.saveAndFlush(courrierAr); }

    public CourrierAr getCourrierById(Long id) { return courrierArRepository.findById(id).get(); }

    public List<CourrierAr> getAllcourrierArs() { return courrierArRepository.findAll(); }
}
