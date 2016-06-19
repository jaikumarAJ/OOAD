package com.javafusion.creational;

public class SingltonClass {

	private static SingltonClass instance;

	private SingltonClass() {
	}

	public static SingltonClass getInstance() {

		if (instance == null) {
			instance = new SingltonClass();
		}

		return instance;
	}

}
