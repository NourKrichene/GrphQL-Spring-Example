package com.example.demo.web.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Country;
import com.example.demo.service.ICountryService;

@Component
public class CountryMutation implements GraphQLMutationResolver {
	@Autowired
	private ICountryService countryService;

	public Country addCountry(String name, String language) {
		var country = new Country();
		country.setName(name);
		country.setLanguage(language);
		countryService.saveCountry(country);
		return country;
	}

	public String deleteCountry(Long id) {
		countryService.deleteCountryById(id);
		return "Country deleted";
	}
}
