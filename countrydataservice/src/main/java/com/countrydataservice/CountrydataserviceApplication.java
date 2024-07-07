package com.countrydataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CountrydataserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountrydataserviceApplication.class, args);
	}

}
