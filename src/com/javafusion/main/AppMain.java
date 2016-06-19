package com.javafusion.main;

import com.javafusion.creational.FactoryClass;
import com.javafusion.creational.PrototypeClass;
import com.javafusion.creational.SingltonClass;
import com.javafusion.creational.factory.Plan;

public class AppMain {
	public static void main(String[] args) {
		// Singlton Example
		SingltonClass obj = SingltonClass.getInstance();

		// Factory example
		FactoryClass factoryGenerator = new FactoryClass();
		Plan planFactoryObject = factoryGenerator.getFactoryObjectPlan("com");

		// Prototype example
		PrototypeClass prototypeClassObject1 = new PrototypeClass(23, "Krishna", "Developer", 23.23, "World");
		try {
			PrototypeClass prototypeClassObject2 = (PrototypeClass) prototypeClassObject1.clone();
		} catch (Exception e) {
			System.out.println("Clone not supporteed execption");
		}

	}
}
