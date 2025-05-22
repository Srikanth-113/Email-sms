package com.example.Service;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service

public class EmailService {
	
	@Autowired
	JavaMailSender javesender;
	
	
	public void emailsender(String to,String name) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject("Registration successful");
		message.setText("Hello " + name + ",\n\n Thank you for registering with us!");
		message.setFrom("your_email@gmail.com");
		
		javesender.send(message);
		System.out.println("Email sent to:" + to);
		
	}

}
