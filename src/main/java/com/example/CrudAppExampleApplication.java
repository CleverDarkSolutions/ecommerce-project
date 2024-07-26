package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CrudAppExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppExampleApplication.class, args);
	}

}
