package com.dawes;

import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IgorSobayevExamenApplication {

	public static void main(String[] args) {
		SpringApplication.run(IgorSobayevExamenApplication.class, args);
		Persistence.generateSchema("pvz", null);
	}

}
