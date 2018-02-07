package missdumbo.codebase.dp.structuralmode;

import org.junit.Test;

import missdumbo.codebase.dp.structuralmode.decorator.ModernPeople;
import missdumbo.codebase.dp.structuralmode.decorator.People;
import missdumbo.codebase.dp.structuralmode.decorator.PoorDecorator;
import missdumbo.codebase.dp.structuralmode.decorator.RichDecorator;

/**
 * @author I325667
 * 装饰器模式(Decorator):
 * 优点：动态地给对象添加功能，相比继承方式更加灵活；通过不同的装饰类的排列组合，可以创造很多不同行为的组合；
 * 	具体构建类和具体装饰类可以独立变化，根据需要增减，符合开闭原则
 * 缺点：产生很多小对象和装饰类，增加系统的复杂度；比继承更灵活，却也易于出错，拍错也困难
 */
public class DecoratorClient {
	@Test
	public void decorator() {
		People p = new ModernPeople();
		p.wear();
		
		p = new RichDecorator(p);
		p.wear();
		
		p = new PoorDecorator(p);
		p.wear();
	}
}
