package com.example.demo.service;

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

}
