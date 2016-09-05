package com.wangguofeng1923.tests;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
/**
 * anyInt,anyString在要对一些mock对象参数进行通配的时候比较适用
 * @author admin
 *
 */
public class ArgMatching {
	@Test
	public void anyInt(){
		ArrayList list=Mockito.mock(ArrayList.class);
		Mockito.when(list.get(Mockito.anyInt())).thenReturn("mock object");
		Assert.assertEquals(null, "mock object", list.get(0));
		Assert.assertEquals(null, "mock object", list.get(100));
	}
	@Test
	public void anyString(){
		HashMap<String, String> map=Mockito.mock(HashMap.class);
		Mockito.when(map.get(Mockito.anyString())).thenReturn("mock object");
		Assert.assertEquals(null, "mock object", map.get("key"));
		Assert.assertEquals(null, "mock object", map.get("mykey"));
	}
}
