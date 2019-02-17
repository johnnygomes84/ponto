package com.mlg.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class PontointeligenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontointeligenteApplication.class, args);
	}
	
	@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
	public class PontoInteligenteApplication {
		
	}

}

