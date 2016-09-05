package com.wangguofeng1923.tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;
/**
 * 基于已经存在的对象来mock一个新的对象
 * @author admin
 *
 */
public class Spy {
	@Test
	public void spy(){
		DemoService service=new DemoService();
		Assert.assertEquals(null, "Hello,guofeng", service.sayHello("guofeng"));
		DemoService demoService=Mockito.spy(service);
		Mockito.when(demoService.sayHello("guofeng")).thenReturn("mock value");
		Assert.assertEquals(null, "mock value", demoService.sayHello("guofeng"));
		
	}

}
