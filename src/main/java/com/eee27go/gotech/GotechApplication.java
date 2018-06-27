package com.eee27go.gotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
@Configuration
public class GotechApplication {

	public static void main(String[] args) {
		SpringApplication.run(GotechApplication.class, args);
	}



}
