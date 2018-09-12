package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(path = "/home") 

public class MyController {
	
	@RequestMapping(path="/request1")
	public String method1() {
		return "hello restAIP";
	}

}
