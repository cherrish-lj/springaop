package com.springlearn.service;

import com.springlearn.dto.ParamDTO;

public interface SayHelloService {

	public String sayHello(String name);
	
	public void saytime(ParamDTO dto);
}
