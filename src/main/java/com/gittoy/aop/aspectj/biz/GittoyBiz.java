package com.gittoy.aop.aspectj.biz;

import org.springframework.stereotype.Service;

import com.gittoy.aop.aspectj.GittoyMethod;

@Service
public class GittoyBiz {

	@GittoyMethod("GittoyBiz save with GittoyMethod.")
	public String save(String arg) {
		System.out.println("GittoyBiz save(String arg) : " + arg);
		// throw new RuntimeException("Save failed!");
		return "Save success!";
	}
}
