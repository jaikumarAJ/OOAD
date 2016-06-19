package com.javafusionphp.structural;

import com.javafusionphp.structural.proxy.UsedClassForProxy;

public class ProxyClass {

	UsedClassForProxy usedClassForProxy;

	public ProxyClass() {
		usedClassForProxy = new UsedClassForProxy();
	}

	/*
	 * I am playing a role of proxy and you do not need to contact to UsedClassForProxy.
	 */
	public void run() {
		usedClassForProxy.run();
	}
}
