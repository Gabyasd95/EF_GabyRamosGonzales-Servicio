package com.idat.ecf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EFRamosGonzalesGabyServicio {

	public static void main(String[] args) {
		SpringApplication.run(EFRamosGonzalesGabyServicio.class, args);
	}

}
