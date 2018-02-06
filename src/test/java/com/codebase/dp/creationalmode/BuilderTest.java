package com.codebase.dp.creationalmode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.codebase.dp.creationalmode.builder.BackgroundBuilder;
import com.codebase.dp.creationalmode.builder.BackgroundDirector;
import com.codebase.dp.creationalmode.builder.BackgroundProduct;
import com.codebase.dp.creationalmode.builder.ChatBackGroundBuilder;
import com.codebase.dp.creationalmode.builder.GameBackGroundBuilder;

public class BuilderTest {
	
	@Before
	public void setUp() {
	}
	
	@Test
	public void buildChat() {
		BackgroundDirector director = new BackgroundDirector();
		BackgroundBuilder builder = new ChatBackGroundBuilder();
		director.setBuilder(builder);
		BackgroundProduct product = director.construct();
		Assert.assertEquals(product.getBackFont(), builder.getBackgroundProduct().getBackFont());
	}
	
	@Test
	public void buildGame() {
		BackgroundDirector director = new BackgroundDirector();
		BackgroundBuilder builder = new GameBackGroundBuilder();
		director.setBuilder(builder);
		BackgroundProduct product = director.construct();
		Assert.assertEquals(product.getBackFont(), builder.getBackgroundProduct().getBackFont());
	}
	
	@After
	public void destroy() {
	}
}
