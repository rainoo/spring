package com.gittoy.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GittoyAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("GittoyAfterReturningAdvice : " + method.getName() + "   " + target.getClass().getName() + "   " + returnValue);
	}

}
