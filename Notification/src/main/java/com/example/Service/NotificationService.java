package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.NotificationDto;

@Service
public class NotificationService {
	
	
	@Autowired
	EmailService email;
	@Autowired
	SmsService sms;
	
	
	public void doboth(NotificationDto client) {
		
		email.emailsender(client.getEmail(), client.getName());
		sms.sendsms(client.getPhonenumber(), client.getName());
		
		
	}

}
