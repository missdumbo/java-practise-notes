package missdumbo.codebase.dp.structuralmode;

import org.junit.Test;

import missdumbo.codebase.dp.structuralmode.flyweight.FlyWeightFactory;
import missdumbo.codebase.dp.structuralmode.flyweight.StringFlyWeight;

public class FlyweightClient {
	@Test
	public void display() {
		StringFlyWeight flyWeight = FlyWeightFactory.getInstance().getFlyweight("one");
		flyWeight.display();
		
		flyWeight = FlyWeightFactory.getInstance().getFlyweight("two");
		flyWeight.display();
		
		flyWeight = FlyWeightFactory.getInstance().getFlyweight("one");
		flyWeight.display();
		
		flyWeight = FlyWeightFactory.getInstance().getFlyweight("there");
		flyWeight.display();
	}
}
