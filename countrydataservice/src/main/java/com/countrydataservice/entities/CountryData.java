package com.countrydataservice.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryData {

    @Id
    private String country_code;
    private String capital;
    private Long population;
    private String flag_file_url;
    transient private String name;
   

}
