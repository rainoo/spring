package com.gittoy.aware;

import org.springframework.beans.factory.BeanNameAware;

public class GittoyBeanName implements BeanNameAware {

	public void setBeanName(String name) {
		System.out.println("GittoyBeanName: " + name);
	}

}
