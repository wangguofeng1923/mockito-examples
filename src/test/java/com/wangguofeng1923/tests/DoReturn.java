package com.wangguofeng1923.tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;
/**
 * mock返回值
 * @author admin
 *
 */
public class DoReturn {
	@Test
	public void doReturn(){
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.doReturn("mock result").when(demoService).sayHello("guofeng");
		Assert.assertEquals(null, "mock result", demoService.sayHello("guofeng"));
	
	}
}
