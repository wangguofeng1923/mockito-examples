package com.wangguofeng1923.tests;

import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;

/**
 * 验证某个方法被调用的次数
 * @author admin
 *
 */
public class Times {
	@Test
	public void times(){
		DemoService demoService=Mockito.mock(DemoService.class);
		
		demoService.sayHello("feng");//第一次调用
		System.out.println("=======第一次调用结束======");
		demoService.sayHello("feng");//第二次调用
		System.out.println("=======第二次调用结束======");
		Mockito.verify(demoService,Mockito.times(2)).sayHello("feng");
		
	
		
	}
}
