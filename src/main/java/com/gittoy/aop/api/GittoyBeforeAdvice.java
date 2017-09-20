package com.gittoy.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GittoyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("GittoyBeforeAdvice : " + method.getName() + "   " + target.getClass().getName());
	}

}
