package com.springlearn.component;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EatingService {

	@Before("execution(* com.springlearn.service.*.sayHello(..))")
	public void xishou(){
		System.out.println("饭前洗手");
	}
	
	@After("execution(* com.springlearn.service.*.sayHello(..))")
	public void shukou(){
		System.out.println("饭后漱口");
	}
	
	@Around("execution(* com.springlearn.service.*.sayHello(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("before");
		Object obj = pjp.proceed();
		System.out.println("after");
		return obj;
	}
}
