package com.wangguofeng1923.tests;

import org.junit.Test;
import org.mockito.Mockito;

import com.wangguofeng1923.service.DemoService;
/**
 * 对mock对象的额外属性设置
 * @author admin
 *
 */
public class WithSettings {
	@Test
	public void withSettings(){
		DemoService demoService = Mockito.mock(DemoService.class, Mockito.withSettings()
	           .defaultAnswer(Mockito.RETURNS_SMART_NULLS)//默认返回值(不设置stub[如:thenReturn]的时候的返回值)
	           .name("cool mockie")//mock 对象的名字
	           .serializable()//添加序列化接口
	           );
		System.out.println(demoService.checkName(null));

	}
}
