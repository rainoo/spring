package com.gittoy.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface {

	public String hello(String word) {
		return "Word from interface \"OneInterface\" : " + word;
	}

}
