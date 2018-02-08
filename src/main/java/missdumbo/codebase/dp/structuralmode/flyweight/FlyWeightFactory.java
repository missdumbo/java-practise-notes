package missdumbo.codebase.dp.structuralmode.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private Map<String, StringFlyWeight> map = new HashMap<>();

	private static FlyWeightFactory instance = new FlyWeightFactory();

	private FlyWeightFactory() {
	}

	public static FlyWeightFactory getInstance() {
		return instance;
	}

	public StringFlyWeight getFlyweight(final String key) {
		if (map.containsKey(key)) {
			return map.get(key);
		}
		StringFlyWeight flyWeight = new ConcreteStringFlyWeight();
		map.put(key, flyWeight);
		return flyWeight;
	}
}
