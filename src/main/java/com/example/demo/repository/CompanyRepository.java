package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Company;

@RepositoryRestResource(collectionResourceRel="companys",path="companys")
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
