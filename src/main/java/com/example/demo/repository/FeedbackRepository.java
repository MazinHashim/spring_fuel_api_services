package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Feedback;

@RepositoryRestResource(collectionResourceRel="feedbacks",path="feedbacks")
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
