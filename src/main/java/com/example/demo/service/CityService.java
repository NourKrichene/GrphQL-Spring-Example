package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;

@Service
public class CityService implements ICityService {

	@Autowired
	private CityRepository repository;

	@Override
	public List<City> findAll() {
		var cities = (List<City>) repository.findAll();
		return cities;
	}

	@Override
	public void saveCity(City city) {
		repository.save(city);
	}

	@Override
	public City getCityById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

}
