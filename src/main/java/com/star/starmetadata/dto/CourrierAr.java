package com.star.starmetadata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class CourrierAr {

//    public class CourrierArDto {
    private String objet;
    private String nature; // list
        private String refExtern; // list
        private String dateArriver;
        private String dateCourrier;
//    }
}
