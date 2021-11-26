package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Service;

@RepositoryRestResource(collectionResourceRel="services",path="services")
public interface ServiceRepository extends JpaRepository<Service, Integer> {

}
