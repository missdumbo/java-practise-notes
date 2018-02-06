package com.codebase.dp.creationalmode.factorymethod;

public class DatabaseLog extends Log{

	@Override
	public void log(String msg) {
		System.out.println("DatabaseLog log call");
	}
	
}
