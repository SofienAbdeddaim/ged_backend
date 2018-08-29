package com.star.starmetadata.repositories;

import com.star.starmetadata.entities.ConfigurationData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConfigurationRepository extends JpaRepository<ConfigurationData, Long> {
//    Optional<ConfigurationData> findFir
}
