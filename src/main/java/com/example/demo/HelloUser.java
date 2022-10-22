package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloUser {

	public static void main(String[] args) {
		SpringApplication.run(HelloUser.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Visitant") String name, @RequestParam(value = "idade", defaultValue = "21") String age) {
		return String.format("Hello %s! your age is: %s", name, age);
	}

}
