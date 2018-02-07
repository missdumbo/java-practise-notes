package missdumbo.codebase.dp.creationalmode.simplefactory;

public class SimpleFactory {
	public static AbstractProduct produce(int code) {
		if (code == 1) {
			return new ConcreteProduct1();
		} else if (code == 2) {
			return new ConcreteProduct2();
		}
		return null;
	}
}
