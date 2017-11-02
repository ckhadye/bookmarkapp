package com.ck.controllers;

import javax.servlet.annotation.WebInitParam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
public class BookmarkRestController {
	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam String name){
	System.out.println("test for git conflict");
	return "helloWorld "+name;	
	}
	
}
