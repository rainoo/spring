package com.gittoy.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class GittoyAspect {

	public void before() {
		System.out.println("GittoyAspect before.");
	}
	
	public void afterReturning() {
		System.out.println("GittoyAspect afterReturning.");
	}

	public void afterThrowing() {
		System.out.println("GittoyAspect afterThrowing.");
	}

	public void after() {
		System.out.println("GittoyAspect after.");
	}

	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("GittoyAspect around 1.");
			obj = pjp.proceed();
			System.out.println("GittoyAspect around 2.");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}

	public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) {
		System.out.println("GittoyAspect aroundInit : " + bizName + "  " + times);
		Object obj = null;
		try {
			System.out.println("GittoyAspect aroundInit 1.");
			obj = pjp.proceed();
			System.out.println("GittoyAspect aroundInit 2.");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}
