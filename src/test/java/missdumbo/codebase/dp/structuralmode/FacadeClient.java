package missdumbo.codebase.dp.structuralmode;

import org.junit.Test;

import missdumbo.codebase.dp.structuralmode.facade.Facade;

/**
 * @author missdumbo
 * 外观模式(Facade)：
 * 优点： 屏蔽子系统，减少客户处理对象数目；子系统和客户松耦合；降低大型系统编译依赖性
 * 缺点：不能限制客户使用子系统类；增加新的子系统需要修改外观类或客户端代码，违背开闭原则
 */
public class FacadeClient {
	@Test
	public void wrap() {
		Facade facade = new Facade();
		facade.wrapOperation();
	}
}
