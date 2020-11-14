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
		return repository.findAll();
	}

	@Override
	public List<City> findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public void saveCity(City city) {
		repository.save(city);
	}

	@Override
	public City getCityById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteCityById(Long id) {
		repository.deleteById(id);
	}

}
