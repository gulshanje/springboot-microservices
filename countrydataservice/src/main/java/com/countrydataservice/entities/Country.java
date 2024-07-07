package com.countrydataservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor

public class Country {

    private String name;
    private String country_code;
    public String getName() {
        return name;
    }
    public String getCountry_code() {
        return country_code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

   

}