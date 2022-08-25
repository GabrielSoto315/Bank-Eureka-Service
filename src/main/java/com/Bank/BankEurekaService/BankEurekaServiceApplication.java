package com.Bank.BankEurekaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankEurekaServiceApplication.class, args);
	}

}
