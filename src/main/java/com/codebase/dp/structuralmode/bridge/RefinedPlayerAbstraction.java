package com.codebase.dp.structuralmode.bridge;

public class RefinedPlayerAbstraction extends PlayerAbstraction {
	
	public RefinedPlayerAbstraction(PlayerPlatform implementor) {
		super(implementor);
	}

	@Override
	public void play() {
		System.out.println("RefinedPlayerAbstraction play call");
		implementor.play();
	}
}
