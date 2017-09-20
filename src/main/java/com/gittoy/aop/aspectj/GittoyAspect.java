package com.gittoy.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GittoyAspect {

	@Pointcut("execution(* com.gittoy.aop.aspectj.biz.*Biz.*(..))")
	public void pointcut(){
		
	}

	@Pointcut("within(com.gittoy.aop.aspectj.biz.*)")
	public void bizPointcut(){
		
	}

	@Before("pointcut()")
	public void before() {
		System.out.println("GittoyAspect.before()");
	}

	@Before("pointcut() && args(arg)")
	public void beforeWithParam(String arg) {
		System.out.println("GittoyAspect.beforeWithParam() : " + arg);
	}

	@Before("pointcut() && @annotation(moocMethod)")
	public void beforeWithAnnotaion(GittoyMethod moocMethod) {
		System.out.println("GittoyAspect.beforeWithAnnotation() : " + moocMethod.value());
	}

	@AfterReturning(pointcut="bizPointcut()", returning="returnValue")
	public void afterReturning(Object returnValue) {
		System.out.println("GittoyAspect.afterReturning() : " + returnValue);
	}

	@AfterThrowing(pointcut="pointcut()", throwing="e")
	public void afterThrowing(RuntimeException e) {
		System.out.println("GittoyAspect.afterThrowing() : " + e.getMessage());
	}

	@After("pointcut()")
	public void after() {
		System.out.println("GittoyAspect.after()");
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around 1.");
		Object obj = pjp.proceed();
		System.out.println("Around 2.");
		System.out.println("Around : " + obj);
		return obj;
	}
}
