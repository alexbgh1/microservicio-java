package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		// Force 'problems' cover Sonar
		String password = "123456";
		String password1 = "123456";

		return "Hola, soy Alex Garnica";
	}
}
