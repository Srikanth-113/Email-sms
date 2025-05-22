package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dto.NotificationDto;
import com.example.Service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	
	@Autowired
    NotificationService notificationservice;
	
	
	@PostMapping("/center")
	public String registerclient(@RequestBody NotificationDto client) {
		
		
		notificationservice.doboth(client);
		return "Registration successful for " +client.getName(); 
		
		
	}

}
