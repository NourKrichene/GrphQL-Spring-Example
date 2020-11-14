package com.example.demo.service;

import java.util.List;

import com.example.demo.model.City;

public interface ICityService {
	List<City> findAll();

	void saveCity(City city);

	City getCityById(Long id);
}
