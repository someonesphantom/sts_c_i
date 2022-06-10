package com.example.demo.HRCountries;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CountriesRepository extends MongoRepository <Countries, String> {

}
