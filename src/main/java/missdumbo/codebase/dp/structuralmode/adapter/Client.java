package missdumbo.codebase.dp.structuralmode.adapter;

public class Client {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.realRequest();
	}
}
