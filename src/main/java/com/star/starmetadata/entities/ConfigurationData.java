package com.star.starmetadata.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Component
@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Indexed
@Table(name = "ConfigurationData")
public class ConfigurationData implements Serializable {

    @Id
    private Long id;
    @Column(name = "rootNodeRef")
    private String rootNodeRef;
    @Column(name = "rootPath")
    private String rootPath;

}
