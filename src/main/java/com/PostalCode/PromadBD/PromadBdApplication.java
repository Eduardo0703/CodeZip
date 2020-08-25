package com.PostalCode.PromadBD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.PostalCode.PromadBD")
public class PromadBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromadBdApplication.class, args);
	}

}
