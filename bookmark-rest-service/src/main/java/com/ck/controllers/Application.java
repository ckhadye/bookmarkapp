package com.ck.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.ck.controllers","com.ck.services.rest","com.ck.services.rest.impl"})
public class Application {

	public static void main(String[] args){
		System.out.println("test1");
		SpringApplication.run(Application.class, args);
	}
	
}
