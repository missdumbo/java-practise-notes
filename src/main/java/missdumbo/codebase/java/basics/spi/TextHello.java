package missdumbo.codebase.java.basics.spi;

public class TextHello implements HelloInterface{

	@Override
	public void sayHello() {
		System.out.println("Text Hello");
	}

}
