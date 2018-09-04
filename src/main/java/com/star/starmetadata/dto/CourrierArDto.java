package com.star.starmetadata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class CourrierArDto {

    private String objet;
    private String nature;
    private String category;
    private String refExtern; // list
    private String repSur; // list
    private String dateArriver;
    private String dateCourrier;

    private String organisme;
    private String contact;
    private String email;
    private String fax;
    private String address1;
    private String address2;
    private String responsable;
    private String enCopie;
    private String importance;

    private String corps;

    private String pathFile;
    private String nodeRef;
    private String comment;

}
