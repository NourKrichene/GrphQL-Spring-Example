package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Country;
import com.example.demo.service.ICountryService;

@Component
public class CountryResolver implements GraphQLQueryResolver {

	@Autowired
	private ICountryService countryService;

	public Country country(Long id) {
		return countryService.getCountryById(id);
	}

	public List<Country> allCountries() {
		return countryService.findAll();
	}

	public List<Country> countriesByName(String name) {
		return countryService.findByName(name);
	}

}
