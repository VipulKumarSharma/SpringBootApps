package io.home.SpringDataRestApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.home.SpringDataRestApp.model.Developer;

@RepositoryRestResource(collectionResourceRel="devs", path="devs")
public interface DeveloperRepo extends JpaRepository<Developer, Integer>{

}
