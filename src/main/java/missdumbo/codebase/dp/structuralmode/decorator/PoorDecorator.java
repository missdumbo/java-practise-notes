package missdumbo.codebase.dp.structuralmode.decorator;

public class PoorDecorator extends Decorator {

	public PoorDecorator(People people) {
		super(people);
	}

	@Override
	public void addJewelry() {
		System.out.println("PoorDecorator addJewelry call");
	}

	@Override
	public void wear() {
		people.wear();
		addJewelry();
	}
}
