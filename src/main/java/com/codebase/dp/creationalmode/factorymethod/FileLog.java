package com.codebase.dp.creationalmode.factorymethod;

public class FileLog extends Log{

	@Override
	public void log(String msg) {
		System.out.println("FileLog log call");
	}
	
}
