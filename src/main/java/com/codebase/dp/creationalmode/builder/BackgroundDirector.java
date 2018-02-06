package com.codebase.dp.creationalmode.builder;

public class BackgroundDirector {
	private BackgroundBuilder builder;

	public void setBuilder(BackgroundBuilder builder) {
		this.builder = builder;
	}
	
	public BackgroundProduct construct() {
		builder.buildBackSize();
		builder.buildBackImage();
		builder.buildBackFont();
		
		return builder.getBackgroundProduct();
	}
}
