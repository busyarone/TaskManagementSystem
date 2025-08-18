package com.example.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TmsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TmsApplication.class, args);

	}

}
