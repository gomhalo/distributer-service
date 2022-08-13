package com.amanuel.aregay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.amanuel.aregay")
public class DistributerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributerWebApplication.class, args);
	}

}
