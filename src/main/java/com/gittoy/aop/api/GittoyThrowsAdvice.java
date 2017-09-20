package com.gittoy.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class GittoyThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("GittoyThrowsAdvice afterThrowing(Exception ex)");
	}

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
		System.out.println("GittoyThrowsAdvice afterThrowing(Method method, Object[] args, Object target, "
				+ "Exception ex)" + method.getName() + "   " + target.getClass().getName());
	}
}
