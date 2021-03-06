package com.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Annotate the class with @SpringBootApplication and @EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
public class CertificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificationApplication.class, args);
	}
}
