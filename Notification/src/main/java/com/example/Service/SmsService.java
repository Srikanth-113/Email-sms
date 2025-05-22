package com.example.Service;

import org.springframework.stereotype.Service;

@Service
public class SmsService {
	
	public void sendsms(String phone,String name) {
		
		System.out.println("SMS sent to " +phone+ "hello :" +name+ "thank you for registering");
	}

}
