package com.codebase.dp.creationalmode.factorymethod;

public class FileLoggerFactory extends LoggerFactory{

	@Override
	public Log createLog() {
		return new FileLog();
	}

}
