package com.star.starmetadata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
public class MetadataDto {

    private String path;
    private String nodeRef;
    private String name;

}
