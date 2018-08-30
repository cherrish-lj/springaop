package com.springlearn.component;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
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
	public void xishou(JoinPoint point){
        System.out.println("@Before：模拟权限检查...");
        System.out.println("@Before：目标方法为：" + 
                point.getSignature().getDeclaringTypeName() + 
                "." + point.getSignature().getName());
        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));
        System.out.println("@Before：被织入的目标对象为：" + point.getTarget());
		System.out.println("饭前洗手");
	}
	
	@After("execution(* com.springlearn.service.*.sayHello(..))")
	public void shukou(JoinPoint point){
		System.out.println("饭后漱口");
	}
	
	@Around("execution(* com.springlearn.service.*.sayHello(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("before");
		Object obj = pjp.proceed();
		
        System.out.println("@Around：执行目标方法之后...");
        System.out.println("@Around：被织入的目标对象为：" + pjp.getTarget());
		
		return obj;
	}
}
