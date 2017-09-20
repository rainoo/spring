package com.gittoy.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.gittoy.ioc.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

	public TestBeanScope() {
		super("classpath*:spring-beanscope.xml");
	}

	@Test
	public void testSay1() {

		BeanScope beanScope1 = super.getBean("beanScope");
		beanScope1.say();

		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
	}

	@Test
	public void testSay2() {

		BeanScope beanScope3 = super.getBean("beanScope");
		beanScope3.say();
	}
}
