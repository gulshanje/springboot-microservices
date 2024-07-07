package com.countrydataservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.countrydataservice.entities.CountryData;

public interface CountryDataRepository extends JpaRepository<CountryData, String> {

}
