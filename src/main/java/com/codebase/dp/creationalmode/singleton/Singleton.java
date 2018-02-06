package com.codebase.dp.creationalmode.singleton;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public void show() {
		System.out.println("Singleton show call");
	}
	
	public boolean isSingleton() {
		return true;
	}
}
