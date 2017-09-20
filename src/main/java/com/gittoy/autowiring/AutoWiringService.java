package com.gittoy.autowiring;

public class AutoWiringService {

	private AutoWiringDao autoWiringDao;

	public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
		System.out.println("setAutoWiringDao()方法执行");
		this.autoWiringDao = autoWiringDao;
	}

	public void say(String word) {
		this.autoWiringDao.say(word);
	}
}
