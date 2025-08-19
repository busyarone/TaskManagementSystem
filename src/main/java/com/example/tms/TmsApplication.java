package com.example.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EntityScan("com.example.tms.model")
public class TmsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(TmsApplication.class, args);

	}

}
