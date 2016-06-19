package com.javafusion.main;

import com.javafusion.creational.FactoryClass;
import com.javafusion.creational.SingltonClass;
import com.javafusion.creational.factory.Plan;

public class AppMain {
	public static void main(String[] args) {
		SingltonClass obj = SingltonClass.getInstance();

		FactoryClass factoryGenerator = new FactoryClass();

		Plan planFactoryObject = factoryGenerator.getFactoryObjectPlan("com");

	}
}
