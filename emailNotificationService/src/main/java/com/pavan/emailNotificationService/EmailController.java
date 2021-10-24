package com.pavan.emailNotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@Autowired private EmailService emailService;
	
	@RequestMapping("/sendmail")
	private String sendMail(@RequestParam String body) {
		emailService.sendMail(body);
		return "mail sent successfully";
		
	}
}
