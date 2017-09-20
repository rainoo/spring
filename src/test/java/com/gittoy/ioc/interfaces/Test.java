package com.gittoy.ioc.interfaces;

public class Test {

	public static void main(String[] args) {
		String[] tmp = "hello world, this,,, is All".split("[,\\s]+");
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}
	}

}
