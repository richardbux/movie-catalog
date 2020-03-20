package com.richhunt.microservices.moviecatalogservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class MovieCatalogServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceDiscoveryApplication.class, args);
	}

}
