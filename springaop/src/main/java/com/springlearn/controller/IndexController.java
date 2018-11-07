package com.springlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springlearn.dto.ParamDTO;
import com.springlearn.enums.AppType;
import com.springlearn.service.SayHelloService;

@RestController
public class IndexController {

	@Autowired
	private SayHelloService sayHelloService;
	
	@PostMapping(value="/index", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String home(@ModelAttribute ParamDTO param) {
		
		sayHelloService.saytime(new ParamDTO("lujian","牧华路"));
		
		return param.getAppType().name();
	}
	
}
