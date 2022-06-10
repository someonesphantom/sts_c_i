package com.example.demo.HRCountries;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RequestMapping("/api/v1")
@Tag(name = "countriesData")
@RestController
public class CountriesController {
	@Autowired
	private CountriesRepository countriesRepo;
	
	@GetMapping("/countries")
	public List <Countries> getAllcountries()
	{
		return countriesRepo.findAll();
	}
	
	@GetMapping("/countries/{id}")
	public Optional<Countries> getcountrybyid(@PathVariable String id)
	{
		return countriesRepo.findById(id);
	}
	
	@PostMapping("/countries")
	public Countries saveCountry( @RequestBody Countries countries)
	
	{
		
		return countriesRepo.save(countries);
		
	}
	
	@PutMapping("/countries/{id}")
	public Countries updateStudent( @RequestBody Countries countries, @PathVariable String id)
	
	{
		Countries currentCountry;
		currentCountry = countriesRepo.findById(id).get();
		currentCountry.setCountryID(countries.getCountryID());
		currentCountry.setCountryName(countries.getCountryName());
		currentCountry.setRegionID(countries.getRegionID());
		return countriesRepo.save(currentCountry);
		
	}
	
	@DeleteMapping("/countries/{id}")
	public void deletecountrybyid(@PathVariable String id)
	{
		countriesRepo.deleteById(id);
	}
}
