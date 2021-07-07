package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	// @Bean
	// public String message() {
	// 	System.out.println(">> message bean created");
	// 	return "hello spring!";
	// }

	// @Bean
	// public String upperMessage(MessageService messageService) {
	// 	System.out.println(">> upperMessage bean created");
	// 	return messageService.upperCaseString();
	// }

	// @Bean
	// public String lowerMessage(MessageService messageService) {
	// 	System.out.println(">> lowerMessage bean created");
	// 	return messageService.lowerCaseString();
	// }

}
