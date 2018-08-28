package com.springlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlearn.service.SayHelloService;

@RestController
public class IndexController {

	@Autowired
	private SayHelloService sayHelloService;
	
	@RequestMapping("/index")
	public String home(String name) {
		sayHelloService.saytime();
		return sayHelloService.sayHello(name);
	}
	
}
