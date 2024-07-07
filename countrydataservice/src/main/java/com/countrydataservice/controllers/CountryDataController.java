package com.countrydataservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.countrydataservice.CountryClient;
import com.countrydataservice.entities.Country;
import com.countrydataservice.entities.CountryData;
import com.countrydataservice.repositories.CountryDataRepository;

@RestController
@RequestMapping("/countrydata")
public class CountryDataController {

    @Autowired
    private CountryDataRepository countryDataRepository;

    @Autowired
    private CountryClient countryClient;

    @GetMapping
    public List<CountryData> getAllCountryData() {
        return countryDataRepository.findAll();
    }

    @GetMapping("/{code}")
    public CountryData getCountryDataByCode(@PathVariable String code) {
        // return countryDataRepository.findById(code).orElse(null);
        CountryData countryData = countryDataRepository.findById(code).orElse(null);
        Country country = countryClient.getCountryByCode(code);
        if (countryData != null && country != null) {
            countryData.setName(country.getName());
        }
        return countryData;
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryClient.getCountryByCode(code);
    }

    @PostMapping
    public CountryData addCountryData(@RequestBody CountryData countryData) {
        return countryDataRepository.save(countryData);
    }
}
