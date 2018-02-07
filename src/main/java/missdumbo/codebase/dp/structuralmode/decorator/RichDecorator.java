package missdumbo.codebase.dp.structuralmode.decorator;

public class RichDecorator extends Decorator {

	public RichDecorator(People people) {
		super(people);
	}

	@Override
	public void addJewelry() {
		System.out.println("RichDecorator addJewelry call");
	}

	@Override
	public void wear() {
		people.wear();
		addJewelry();
	}
}
