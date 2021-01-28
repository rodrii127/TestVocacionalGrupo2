package com.example.demo.controllers.imp;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.StartApplicationController;

@RestController
@RequestMapping("/startApplication")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT,RequestMethod.DELETE})
@ControllerAdvice()
public class StartApplicationControllerImp implements StartApplicationController{
	
	@Override
	@GetMapping
	public void startApplication() {
		System.out.println("The application just start");
	}
}
