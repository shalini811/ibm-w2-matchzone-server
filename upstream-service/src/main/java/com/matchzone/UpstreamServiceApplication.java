package com.matchzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//Annotate this class with @SpringBootApplication
@EnableEurekaClient // for eureka client to discover services
@SpringBootApplication
public class UpstreamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpstreamServiceApplication.class, args);
	}
}
