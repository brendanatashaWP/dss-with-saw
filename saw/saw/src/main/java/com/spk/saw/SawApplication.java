package com.spk.saw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SawApplication {

	public static void main(String[] args) {
		SpringApplication.run(SawApplication.class, args);
	}
}
