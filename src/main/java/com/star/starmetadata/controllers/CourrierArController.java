package com.star.starmetadata.controllers;


import com.star.starmetadata.entities.CourrierAr;
import com.star.starmetadata.services.CourrierArService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/courrierAr/")
public class CourrierArController {

    @Autowired
    CourrierArService courrierArService;

    //    for add a courrier
    @RequestMapping(value = "/saveCourrier", method = RequestMethod.POST)
    public void save(@RequestBody CourrierAr courrierAr) {
        courrierArService.saveCourrier(courrierAr);
    }

    //    for update a courrier
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void update(@RequestBody CourrierAr courrierAr) {
        courrierArService.updateCourrier(courrierAr);
    }

    //    for get by id a courrier
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public CourrierAr getById(@PathVariable Long id) {
        return courrierArService.getCourrierById(id);
    }

    //    for get all a courrier
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<CourrierAr> getById() {
        return courrierArService.getAllcourrierArs();
    }
}
