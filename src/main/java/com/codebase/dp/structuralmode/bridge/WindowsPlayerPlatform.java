package com.codebase.dp.structuralmode.bridge;

public class WindowsPlayerPlatform extends PlayerPlatform{

	public WindowsPlayerPlatform(MediaType type) {
		this.type = type;
	}
	
	@Override
	public void play() {
		System.out.println("WindowsPlayerPlatform play call");
		type.typeValue();
	}
}
