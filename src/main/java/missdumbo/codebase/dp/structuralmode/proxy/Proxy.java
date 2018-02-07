package missdumbo.codebase.dp.structuralmode.proxy;

public class Proxy extends Subject{
	
	private Subject subject;
	
	public Proxy() {
		this.subject = new RealSubject();
	}
	
	public void preRequest() {
		System.out.println("Proxy preRequest call");
	}
	
	public void afterRequest() {
		System.out.println("Proxy afterRequest call");
	}

	@Override
	public void request() {
		preRequest();
		subject.request();
		afterRequest();
	}
	
}
