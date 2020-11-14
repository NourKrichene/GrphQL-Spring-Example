package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.City;

@Component
public class CityResolver implements GraphQLQueryResolver {

	@Autowired
	private ICityService cityService;

	public City city(Long id) {
		return cityService.getCityById(id);
	}

	public List<City> findAll() {
		return cityService.findAll();
	}

	public List<City> findByName(String name) {
		return cityService.findByName(name);
	}

}
