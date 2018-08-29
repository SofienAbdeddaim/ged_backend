package com.star.starmetadata.entities;

import com.star.starmetadata.dto.MetadataDto;
import jdk.internal.org.objectweb.asm.tree.analysis.Analyzer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.Store;
import org.jboss.logging.Field;
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
@Table(name = "Metadata")
public class Metadata implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="path")
    private String path;
    @Column(name="nodeRef")
    private String nodeRef;
    @Column(name="name")
    private String name;

    // TODO: 19/06/2018 Builder tasks
//public static MetadataDto metadataToMetadataDto() {
//return null;
//}
}
