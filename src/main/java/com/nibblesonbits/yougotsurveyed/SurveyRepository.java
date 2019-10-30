package com.nibblesonbits.yougotsurveyed;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel="survey", path="survey")
public interface SurveyRepository extends MongoRepository<Survey, String> {
    List<Survey> findByName(String name);
}
