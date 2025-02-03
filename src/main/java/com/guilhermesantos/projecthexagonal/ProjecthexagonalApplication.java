package com.guilhermesantos.projecthexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class ProjecthexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjecthexagonalApplication.class, args);
	}

}
