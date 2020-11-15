package com.example.demo.web.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.City;
import com.example.demo.service.ICityService;

@Component
public class CityMutation implements GraphQLMutationResolver {
	@Autowired
	private ICityService cityService;

	public City addCity(String name, int population) {
		var city = new City();
		city.setName(name);
		city.setPopulation(population);
		cityService.saveCity(city);
		return city;
	}

	public String deleteCity(Long id) {
		cityService.deleteCityById(id);
		return "City deleted";
	}
}
