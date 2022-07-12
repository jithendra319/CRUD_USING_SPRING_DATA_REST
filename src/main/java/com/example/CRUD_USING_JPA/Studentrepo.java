package com.example.CRUD_USING_JPA;

import com.example.CRUD_USING_JPA.enitity1.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "students",path="students")
public interface Studentrepo extends JpaRepository<student, Integer> {

}
