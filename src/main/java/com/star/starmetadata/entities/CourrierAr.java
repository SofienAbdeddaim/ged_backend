package com.star.starmetadata.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;
import java.io.Serializable;

@Component
@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Indexed
@Table(name = "CourrierAr")
public class CourrierAr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="objet")
    private String objet;
    @Column(name="nature")
    private String nature;
    @Column(name="category")
    private String category;
    @Column(name="refExtern")
    private String refExtern; // list
    @Column(name="repSur")
    private String repSur; // list
    @Column(name="dateArriver")
    private String dateArriver;
    @Column(name="dateCourrier")
    private String dateCourrier;

    @Column(name="organisme")
    private String organisme;
    @Column(name="contact")
    private String contact;
    @Column(name="email")
    private String email;
    @Column(name="fax")
    private String fax;
    @Column(name="address1")
    private String address1;
    @Column(name="address2")
    private String address2;
    @Column(name="responsable")
    private String responsable;
    @Column(name="enCopie")
    private String enCopie;
    @Column(name="importance")
    private String importance;

    @Column(name="corps")
    private String corps;

    @Column(name="pathFile")
    private String pathFile;
    @Column(name="nodeRef")
    private String nodeRef;

    @Column(name="comment")
    private String comment;

}
