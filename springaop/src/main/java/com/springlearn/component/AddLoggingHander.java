package com.springlearn.component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AddLoggingHander {

	@Before("@annotation(com.springlearn.annotation.Logging)")
	public void addLog(){
		System.out.println("注解添加日志!");
	}
}
