package com.projeto.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.projeto"})
public class APIrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(APIrestApplication.class, args);
	}

}
