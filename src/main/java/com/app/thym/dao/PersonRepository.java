package com.app.thym.dao;

import com.app.thym.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "person" ,path= "person")
public interface PersonRepository extends JpaRepository<Person ,Integer> {
}
