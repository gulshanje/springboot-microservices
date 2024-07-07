package com.countryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.countryservice.entities.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}
