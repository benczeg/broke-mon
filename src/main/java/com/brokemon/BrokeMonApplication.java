package com.brokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

@SpringBootApplication(exclude = {JdbcTemplateAutoConfiguration.class})
public class BrokeMonApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrokeMonApplication.class, args);
	}

}
