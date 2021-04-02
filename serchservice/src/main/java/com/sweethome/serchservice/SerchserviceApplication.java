package com.sweethome.serchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SerchserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerchserviceApplication.class, args);
	}

}
