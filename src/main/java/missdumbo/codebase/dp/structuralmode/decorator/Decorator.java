package missdumbo.codebase.dp.structuralmode.decorator;

public abstract class Decorator extends People {
	protected People people;
	
	public Decorator(People people) {
		this.people = people;
	}
	
	public abstract void addJewelry();
}
