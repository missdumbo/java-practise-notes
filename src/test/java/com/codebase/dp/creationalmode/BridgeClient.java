package com.codebase.dp.creationalmode;

import org.junit.Test;

import com.codebase.dp.structuralmode.bridge.AviMediaType;
import com.codebase.dp.structuralmode.bridge.LinuxPlayerPlatform;
import com.codebase.dp.structuralmode.bridge.MediaType;
import com.codebase.dp.structuralmode.bridge.PlayerAbstraction;
import com.codebase.dp.structuralmode.bridge.PlayerPlatform;
import com.codebase.dp.structuralmode.bridge.RefinedPlayerAbstraction;
import com.codebase.dp.structuralmode.bridge.RmvbMediaType;
import com.codebase.dp.structuralmode.bridge.WindowsPlayerPlatform;

/**
 * @author missdumbo
 * 桥接模式(Bridge):
 * 优点: 分离抽象接口与其实现部分; 实现细节对客户透明;可以在 不同的维度任意扩展一个维度, 扩展性强, 符合开闭原则
 * 缺点: 聚合关联关系建立在抽象层，要求开发者针对抽象进行设计编程；需要正确识别系统中独立变化的维度
 */
public class BridgeClient {
	
	@Test
	public void play() {
		MediaType rmvb = new RmvbMediaType();
		PlayerPlatform implementor1 = new WindowsPlayerPlatform(rmvb);
		PlayerAbstraction pa = new RefinedPlayerAbstraction(implementor1);
		pa.play();
		
		MediaType avi = new AviMediaType();
		implementor1 = new WindowsPlayerPlatform(avi);
		pa = new RefinedPlayerAbstraction(implementor1);
		pa.play();
		
		implementor1 = new LinuxPlayerPlatform(rmvb);
		pa = new RefinedPlayerAbstraction(implementor1);
		pa.play();
	}
}
