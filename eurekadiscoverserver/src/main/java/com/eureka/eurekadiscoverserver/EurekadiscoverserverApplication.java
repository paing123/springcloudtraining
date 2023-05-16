package com.eureka.eurekadiscoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekadiscoverserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekadiscoverserverApplication.class, args);
	}

}
