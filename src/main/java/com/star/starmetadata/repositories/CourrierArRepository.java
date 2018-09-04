package com.star.starmetadata.repositories;

import com.star.starmetadata.entities.CourrierAr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourrierArRepository extends JpaRepository<CourrierAr, Long> {

    Optional<CourrierAr> findById(Long id);

}
