package com.codebase.dp.structuralmode.proxy;

public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("RealSubject request call");
	}
}
