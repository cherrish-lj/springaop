package com.springlearn.service.imp;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.springlearn.annotation.Logging;
import com.springlearn.service.SayHelloService;


@Service
public class SayHelloServiceImpl implements SayHelloService{

	@Logging
	public String sayHello(String name){
		return "hello : "+ name;
	}
	
	public void saytime(){
		System.out.println(new Date());
	}
}
