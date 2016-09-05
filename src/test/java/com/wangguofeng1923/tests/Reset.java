package com.wangguofeng1923.tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;

/**
 * rest 将会使mock对象的状态与最初mock出来的时候一样，没有任何的数据设置或者调用
 * @author admin
 *
 */
public class Reset {
	@Test
	public void reset(){
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.when(demoService.sayHello("guofeng")).thenReturn("mock value");
		Assert.assertEquals(null, "mock value", demoService.sayHello("guofeng"));//此处判断通过
		Mockito.reset(demoService);//重置mock对象
		Assert.assertEquals(null, "mock value", demoService.sayHello("guofeng"));//此处判断无法通过
	}
}
