package com.gittoy.aop.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.gittoy.aop.aspectj.biz.GittoyBiz;
import com.gittoy.ioc.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectJ extends UnitTestBase {

	public TestAspectJ() {
		super("classpath*:spring-aop-aspectj.xml");
	}

	@Test
	public void test() {
		GittoyBiz biz = (GittoyBiz) super.getBean("gittoyBiz");
		biz.save("This is a test.");
	}

}
