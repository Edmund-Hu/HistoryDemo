package com.edmund.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.sun.crypto.provider.RSACipher;

import sun.security.provider.VerificationProvider;

public class UserServiceAspect {
	public void doBefore(JoinPoint jp){
		System.out.println("类名是："+jp.getTarget().getClass().getName());
		System.out.println("方法名是："+jp.getSignature().getName());
		System.out.println("这是前置方法"+"参数是"+jp.getArgs()[0]);
	}
	//后置通知
	public void doAfter(JoinPoint jp){
		System.out.println("这是后置方法");
	}
	//环绕通知
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("这是环绕方法前_____");
		Object result = pjp.proceed();//����ʵ�ʷ���
		System.out.println("这是环绕方法后______");
		return result;
		
	}
	//返回通知
	public void doReturn(JoinPoint jp){
		System.out.println("这是返回通知");
	}
	//异常通知
	public void doException(JoinPoint jp){
		System.out.println("这是异常通知");
	}
}
