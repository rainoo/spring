package com.gittoy.aop.schema.advice;

public class FitImpl implements Fit {

	@Override
	public void filter() {
		System.out.println("FitImpl filter");
	}

}
