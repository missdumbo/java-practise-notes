package missdumbo.codebase.dp.creationalmode;

import org.junit.Test;

import missdumbo.codebase.dp.structuralmode.proxy.Proxy;

public class ProxyClient {
	@Test
	public void testProxy() {
		Proxy proxy = new Proxy();
		proxy.request();
	}
}
