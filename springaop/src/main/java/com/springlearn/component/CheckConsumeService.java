package com.springlearn.component;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckConsumeService {

	
	
	
//	@Before("@annotation(com.springlearn.annotation.CheckConsume)")
	public void xishou(JoinPoint point){
        System.out.println("@Before：自定义注解CheckConsume AOP...");
        System.out.println("@Before：目标方法为：" + 
                point.getSignature().getDeclaringTypeName() + 
                "." + point.getSignature().getName());
        System.out.println("@Before：参数为：" + Arrays.toString(point.getArgs()));
        System.out.println("@Before：被织入的目标对象为：" + point.getTarget());
	}
	
	/**
	 * 测试aop 记录刷新缓存
	 * @return
	 * @throws Throwable 
	 */
	@Around("@annotation(com.springlearn.annotation.CheckConsume)")
	public Object testAround(ProceedingJoinPoint point) throws Throwable {
		long start = System.currentTimeMillis();//开始时间
		
		try {
			return point.proceed();
		} finally {
			long end = System.currentTimeMillis();//结束时间
            long duration = end - start;
            System.out.println("方法耗时 : "+duration +"毫秒");
		}
	}
}
