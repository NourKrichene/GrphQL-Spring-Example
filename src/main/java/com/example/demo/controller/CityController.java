package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.City;
import com.example.demo.service.ICityService;

@Controller
public class CityController {
	@Autowired
	private ICityService cityService;

	@GetMapping("/cities")
	public ResponseEntity<List<City>> findCities() {
		List<City> cities = cityService.findAll();
		return new ResponseEntity<List<City>>(cities, HttpStatus.OK);
	}
}
