package com.wangguofeng1923.tests;

import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;
/**
 * 方法只被调用过一次
 * @author admin
 *
 */
public class Only {
	@Test
	public void only(){
		DemoService demoService=Mockito.mock(DemoService.class);
		
		demoService.sayHello("feng");//第一次调用
		Mockito.verify(demoService,Mockito.only()).sayHello("feng");
		System.out.println("=======第一次调用结束======");
		demoService.sayHello("feng");//第二次调用
		Mockito.verify(demoService,Mockito.only()).sayHello("feng");//此处的验证将会出错
	
		
	}
}
