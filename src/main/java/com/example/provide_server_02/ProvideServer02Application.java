package com.example.provide_server_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProvideServer02Application {

	public static void main(String[] args) {
		SpringApplication.run(ProvideServer02Application.class, args);
	}

}
