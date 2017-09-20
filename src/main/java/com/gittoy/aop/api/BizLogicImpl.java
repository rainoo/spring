package com.gittoy.aop.api;

public class BizLogicImpl implements BizLogic {

	@Override
	public String save() {
		System.out.println("BizLogicImpl : save()");
		return "BizLogicImpl save.";
	}

}
