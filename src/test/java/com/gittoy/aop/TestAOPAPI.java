package com.gittoy.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.gittoy.aop.api.BizLogic;
import com.gittoy.ioc.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAPI extends UnitTestBase {

	public TestAOPAPI() {
		super("classpath*:spring-aop-api.xml");
	}

	@Test
	public void testSave() {
		BizLogic logic = (BizLogic) super.getBean("bizLogicImpl");
		logic.save();
	}

}
