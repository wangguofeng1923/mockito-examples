package com.wangguofeng1923.tests;

import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;
/**
 * mock返回值为void的方法，什么也不做(原方法的方法体不会被执行)
 * @author admin
 *
 */
public class DoNothing {
	@Test
	public void doNothing(){
		System.out.println("=========DoNothing===========");
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.doNothing().when(demoService).printName("guofeng");
		demoService.printName("guofeng");
		System.out.println("=========Call Method=========");
		new DemoService().printName("guofeng");
	}
}
