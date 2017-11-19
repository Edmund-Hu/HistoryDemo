package com.edmund.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class UserAdvice {
	public void doBefore(){
		System.out.println("这是前置方法");
	}
	
	public void doAfter(){
		System.out.println("这是后置方法");
	}
	
	public Object doAround(ProceedingJoinPoint pjt) throws Throwable{
		System.out.println("1111111111111");
		Object result = pjt.proceed();
		System.out.println("2222222222222222");
		return result;
	}
}
