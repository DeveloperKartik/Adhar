package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class AdharCardEnrollmentProducerCenterApplication {

	public static void main(String[] args) {
		System.out.println("Adhar Card Enrollment Producer Center Application");
		SpringApplication.run(AdharCardEnrollmentProducerCenterApplication.class, args);
	}

}
