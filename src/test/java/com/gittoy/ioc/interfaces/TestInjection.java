package com.gittoy.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.gittoy.ioc.base.UnitTestBase;
import com.gittoy.ioc.injection.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

	public TestInjection() {
		super("classpath*:spring-injection.xml");
	}

	@Test
	public void testSetter() {
		
		InjectionService injectionService = super.getBean("injectionService");
		injectionService.save("这是要保存的数据");
	}

	@Test
	public void testCons() {
		
		InjectionService injectionService = super.getBean("injectionService");
		injectionService.save("这是要保存的数据");
	}
}
