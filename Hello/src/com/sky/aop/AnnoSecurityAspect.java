package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

public class AnnoSecurityAspect {
	
	@Before("execution(* com.sky.aop.ApplicationService.*(..))")
	
	public void verifyApplicationForm()
	{
		System.out.println("in a annotation before call");
	}
	
	@After("execution(* com.sky.aop.ApplicationService.*(..))")
	
	public void processResult()
	{
		System.out.println("processResults");

	}
	
	

}
