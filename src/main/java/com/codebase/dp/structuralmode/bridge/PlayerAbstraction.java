package com.codebase.dp.structuralmode.bridge;

public abstract class PlayerAbstraction {
	public abstract void play();
	
	protected PlayerPlatform implementor;
	
	public PlayerAbstraction(PlayerPlatform implementor) {
		this.implementor = implementor;
	}
}
