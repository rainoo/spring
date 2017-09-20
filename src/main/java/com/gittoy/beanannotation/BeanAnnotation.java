package com.gittoy.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanAnnotation {

	public void say(String word) {
		System.out.println("BeanAnnotation : " + word);
	}

	public void myHashCode() {
		System.out.println("BeanAnnotation ：" + this.hashCode());
	}
}