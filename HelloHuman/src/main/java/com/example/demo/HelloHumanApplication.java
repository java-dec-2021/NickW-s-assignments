package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@Controller

public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	@RequestMapping("/")
	
	public String hello() {
		return "Index.jsp";
	}
	
	@RequestMapping("/fname")
	
	public String firstname() {
		return "Hello Nick";
	}
	
	

}
