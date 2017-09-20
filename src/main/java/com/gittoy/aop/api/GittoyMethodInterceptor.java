package com.gittoy.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class GittoyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("GittoyMethodInterceptor 1 : " + invocation.getMethod().getName() + "   " + invocation.getStaticPart().getClass().getName());
		Object obj = invocation.proceed();
		System.out.println("GittoyMethodInterceptor 2 : " + obj);
		return obj;
	}

}
