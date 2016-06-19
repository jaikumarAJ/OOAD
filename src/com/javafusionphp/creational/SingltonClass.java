package com.javafusionphp.creational;

public class SingltonClass {

	private static SingltonClass instance;

	/*
	 * Class Instance can not be created like this SingltonClass obj = new
	 * SingltonClass(); for that we have made Constructor private.
	 */
	private SingltonClass() {
	}

	/*
	 * Only way to create object is 
	 * SingltonClass obj = SingltonClass.getInstance(); 
	 * thus it will share the same Singlton object
	 * across the application.
	 */
	public static SingltonClass getInstance() {

		if (instance == null) {
			instance = new SingltonClass();
		}

		return instance;
	}

}
