package com.javafusionphp.main;

import com.javafusionphp.creational.FactoryClass;
import com.javafusionphp.creational.PrototypeClass;
import com.javafusionphp.creational.SingltonClass;
import com.javafusionphp.creational.factory.Plan;
import com.javafusionphp.structural.adapter.SimpleMediaPlayer;
import com.javafusionphp.structural.adapter.SimpleMediaPlayerImpl;

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
		
		// Adapter example
		SimpleMediaPlayer mmp = new SimpleMediaPlayerImpl();
		mmp.play("mp3", "yaa this one");
		mmp.play("video", "yaa this  vido one");
		mmp.play("mp4", "Please play mp4");

	}
}
