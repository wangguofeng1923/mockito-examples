package com.wangguofeng1923.tests;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

public class MockitoTest {
	@SuppressWarnings("unchecked")
	@Test
	public void mock(){
		List<String>list=(List<String>)Mockito.mock(List.class);
		Mockito.when(list.get(0)).thenReturn("this is mock value");
		Assert.assertEquals(null,"this is mock value", list.get(0));
	}
}
