package com.codebase.java.basics.spi;

import java.util.ServiceLoader;

public class SpiMain {
	public static void main(String[] args) {
		ServiceLoader<HelloInterface> loaders = ServiceLoader.load(HelloInterface.class);
		
		for(HelloInterface a: loaders) {
			a.sayHello();
		}
		
	}
}
