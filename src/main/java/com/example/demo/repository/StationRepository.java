package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Station;

@RepositoryRestResource(collectionResourceRel="stations",path="stations")
public interface StationRepository extends JpaRepository<Station, Integer> {

}
