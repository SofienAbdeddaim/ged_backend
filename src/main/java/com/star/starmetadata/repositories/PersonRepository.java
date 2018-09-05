package com.star.starmetadata.repositories;

import com.star.starmetadata.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  PersonRepository extends JpaRepository<Person, Long> {
    Person findByUsername(String username);
}
