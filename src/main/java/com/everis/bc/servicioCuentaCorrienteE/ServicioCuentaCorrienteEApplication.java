package com.everis.bc.servicioCuentaCorrienteE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ServicioCuentaCorrienteEApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioCuentaCorrienteEApplication.class, args);
	}

}
