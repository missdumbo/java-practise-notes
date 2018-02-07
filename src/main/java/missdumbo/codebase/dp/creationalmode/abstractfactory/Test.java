package missdumbo.codebase.dp.creationalmode.abstractfactory;

public class Test {
	public static void main(String[] args) {
		AbstractFactory af = new ConcreteFactory1();
		AbstractProductA pa = af.createProductA();
		AbstractProductB pb = af.createProductB();
		pa.use();
		pb.eat();
		
		AbstractFactory af2 = new ConcreteFactory2();
		AbstractProductA pa2 = af2.createProductA();
		AbstractProductB pb2 = af2.createProductB();
		pa2.use();
		pb2.eat();
	}
}
