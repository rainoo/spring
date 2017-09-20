package com.gittoy.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.gittoy.ioc.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {

	public TestAware() {
		super("classpath*:spring-aware.xml");
	}

//	@Test
//	public void testGittoyApplicationContext() {
//		System.out.println("testGittoyApplicationContext:" + super.getBean("gittoyApplicationContext"));
//	}

	@Test
	public void testGittoyBeanName() {
		System.out.println("testGittoyBeanName: " + super.getBean("gittoyBeanName"));
	}
}
