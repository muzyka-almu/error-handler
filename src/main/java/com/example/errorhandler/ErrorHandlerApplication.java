package com.example.errorhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.errorhandler"})
public class ErrorHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErrorHandlerApplication.class, args);
	}
}
