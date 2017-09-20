package com.gittoy.beanannotation.javabased;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.gittoy.ioc.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavaBased extends UnitTestBase {

	public TestJavaBased() {
		super("classpath*:spring-beanannotation.xml");
	}

	@Test
	public void testMyDriverManager() {
		MyDriverManager myDriverManager = super.getBean("myDriverManager");
		System.out.println(myDriverManager.getClass().getName());
	}
}
