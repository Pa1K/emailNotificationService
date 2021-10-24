package com.pavan.emailNotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailNotificationServiceApplication{

	@Autowired
    private EmailService emailService;
	
	public static void main(String[] args) {
		SpringApplication.run(EmailNotificationServiceApplication.class, args);
	}

}
