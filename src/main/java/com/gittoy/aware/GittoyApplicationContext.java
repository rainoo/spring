package com.gittoy.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class GittoyApplicationContext implements ApplicationContextAware {

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("GittoyApplicationContext: " + applicationContext.getBean("gittoyApplicationContext"));
	}

}
