package com.wangguofeng1923.tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;
/**
 * mock 异常信息
 * @author admin
 *
 */
public class DoThrow {
	@Test(expected = RuntimeException.class)
	public void doThrow(){
		DemoService demoService=Mockito.mock(DemoService.class);
		
		Mockito.doThrow(new RuntimeException("Test Exception"))
		.when(demoService.sayHello("guofeng"));
		String result=demoService.sayHello("guofeng");
		
	}
}
