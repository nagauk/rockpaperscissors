package com.rps.rockpaperscissors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rps.rockpaperscissors")
public class RockpaperscissorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RockpaperscissorsApplication.class, args);
	}

}
