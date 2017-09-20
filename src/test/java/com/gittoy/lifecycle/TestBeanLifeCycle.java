package com.gittoy.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.gittoy.ioc.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {

	public TestBeanLifeCycle() {
		super("classpath*:spring-lifecycle.xml");
	}

	@Test
	public void test1() {
		super.getBean("beanLifeCycle");
	}
}
