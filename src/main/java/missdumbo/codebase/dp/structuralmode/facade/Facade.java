package missdumbo.codebase.dp.structuralmode.facade;

public class Facade {
	SystemA systemA;
	SystemB systemB;
	SystemC systemC;
	
	public Facade() {
		systemA = new SystemA();
		systemB = new SystemB();
		systemC = new SystemC();
	}
	
	public void wrapOperation() {
		System.out.println("Facade wrapOperation start");
		systemA.operationA();
		systemB.operationB();
		systemC.operationC();
		System.out.println("Facade wrapOperation end");
	}
}
