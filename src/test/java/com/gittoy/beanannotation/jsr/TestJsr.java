package com.gittoy.beanannotation.jsr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.gittoy.ioc.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase {

	public TestJsr() {
		super("classpath*:spring-beanannotation.xml");
	}

	@Test
	public void testSave() {
		JsrService jsrService = super.getBean("jsrService");
		jsrService.save();
	}
}
