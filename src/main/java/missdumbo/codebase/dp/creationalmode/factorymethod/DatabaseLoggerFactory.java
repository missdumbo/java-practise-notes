package missdumbo.codebase.dp.creationalmode.factorymethod;

public class DatabaseLoggerFactory extends LoggerFactory{

	@Override
	public Log createLog() {
		return new DatabaseLog();
	}

}
