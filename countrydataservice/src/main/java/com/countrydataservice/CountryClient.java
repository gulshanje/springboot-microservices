package com.countrydataservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.countrydataservice.entities.Country;

@FeignClient(name = "country-service", url = "http://localhost:8081")
public interface CountryClient {

    @GetMapping("/countries")
    List<Country> getAllCountries();

    @GetMapping("/countries/{code}")
    Country getCountryByCode(@PathVariable String code);
}