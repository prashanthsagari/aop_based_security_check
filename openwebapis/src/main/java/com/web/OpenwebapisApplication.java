package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.custom", "com.web"})
public class OpenwebapisApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenwebapisApplication.class, args);
	}

}
