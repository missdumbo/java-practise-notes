package missdumbo.codebase.dp.creationalmode;

import org.junit.Assert;
import org.junit.Test;

import missdumbo.codebase.dp.creationalmode.singleton.Singleton;

public class SingletonTest {
	@Test
	public void test() {
		Singleton singleton = Singleton.getInstance();
		singleton.show();
		Assert.assertEquals(true, singleton.isSingleton());
	}
}
