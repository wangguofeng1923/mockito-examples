package com.wangguofeng1923.tests;


import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.wangguofeng1923.service.DemoService;

public class DemoServiceTest {
	@Test
	public void thenReturn(){
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.when(demoService.sayHello("wangguofeng")).thenReturn("mock:wangguofeng");
	
		Assert.assertEquals(null,"mock:wangguofeng", demoService.sayHello("wangguofeng"));
	}
	@Test
	public void thenCallRealMethod(){
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.when(demoService.sayHello("Test")).thenCallRealMethod();
		Assert.assertEquals(null,"Hello,Test", demoService.sayHello("Test"));
		Assert.assertEquals("","Hello,wangguofeng", demoService.sayHello("wangguofeng"));
	}
	@Test
	public void thenAnswer(){
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.when(demoService.sayHello("Test")).thenAnswer(new Answer<String>() {

			@Override
			public String answer(InvocationOnMock invocation) throws Throwable {
				
				return "answer";
			}
		});
		Assert.assertEquals(null,"answer", demoService.sayHello("Test"));
	}
	@Test(expected = RuntimeException.class)
	public void thenThrow(){
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.when(demoService.sayHello("Test")).thenThrow(new RuntimeException("Test Exception"));
		String v=demoService.sayHello("Test");
	}
	
	@Test
	public void multiReturn(){
		DemoService demoService=Mockito.mock(DemoService.class);
		Mockito.when(demoService.sayHello("Test"))
		.thenReturn("Test Value")
		.thenThrow(new RuntimeException("Test Exception"))
		.thenReturn("wangguofeng");
		System.out.println(demoService.sayHello("Test"));
		try{
			System.out.println(demoService.sayHello("Test"));
		}catch(Throwable t){
			t.printStackTrace();
		}
		
		System.out.println(demoService.sayHello("Test"));
		System.out.println(demoService.sayHello("Test"));
	}
	
}
