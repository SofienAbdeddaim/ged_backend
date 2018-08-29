package com.star.starmetadata.repositories;

import com.star.starmetadata.entities.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MetadataRepository extends JpaRepository<Metadata, Long> {
    Optional<Metadata> findById(Long id);
}
