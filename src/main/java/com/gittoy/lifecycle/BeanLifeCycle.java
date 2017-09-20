package com.gittoy.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		System.out.println("destroy...");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet...");
	}

//	public void start() {
//		System.out.println("bean start...");
//	}
//
//	public void stop() {
//		System.out.println("bean stop...");
//	}
}
