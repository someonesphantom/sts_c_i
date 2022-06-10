package com.example.demo.summerInterns;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InternsRepository extends MongoRepository <interns, String> {

}
