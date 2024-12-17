package com.server.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServerServiceApplication.class, args);
		///////////CIRCUIT BREAKER, Spring ACTUATOR,Spring AOP/////////////////
		/////HOW DO YOU IMPLEMENT SPRING SECURITY IN YOUR PROJECT///////
		///HOW DO UOU IMPLEMENT EXCEPTION IN YOUR PROJECT///
		/////HOW DO YOU IMPLEMENT JWT TOKEN IN YOUR PROJECT/////
		////IMPLEMENT VALIDATION IN YOUR PROJECT////
		///HOW MANY WAYS YOU CAN CREATE A THREAD////
	}

}
