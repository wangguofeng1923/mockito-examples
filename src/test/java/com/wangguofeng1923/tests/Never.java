package com.wangguofeng1923.tests;

import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;
/**
 * 方法没有被调用过
 * @author admin
 *
 */
public class Never {
	@Test
	public void never(){
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.verify(demoService,Mockito.never()).sayHello("feng");
		demoService.sayHello("feng");//第一次调用
		System.out.println("=======第一次调用结束======");
		Mockito.verify(demoService,Mockito.never()).sayHello("feng");//此处的验证将会出错
	
		
	}
}
