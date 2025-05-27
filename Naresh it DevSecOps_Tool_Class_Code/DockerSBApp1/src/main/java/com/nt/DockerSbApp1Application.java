package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerSbApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerSbApp1Application.class, args);
		System.out.println("Welcome Spring boot Docker App");
		
	}

}
