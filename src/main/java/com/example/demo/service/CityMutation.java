package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.City;

@Component
public class CityMutation implements GraphQLMutationResolver {
	@Autowired
	private ICityService cityService;

	public City saveCity(String name, int population) {
		var city = new City();
		city.setName(name);
		city.setPopulation(population);
		cityService.saveCity(city);
		return city;
	}
}
