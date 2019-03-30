package com.niit.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.BDDMockito.mock;
import static org.mockito.Mockito.when;


public class MockitoHelloWorld1 {


	private Demo d;
	
	@Before
	public void setupMock()
	{
		d = mock(Demo.class);
		when(d.greet()).thenReturn(Demo.HELLO_WORLD);
	}
	
	@Test
	public void foodGreets()
	{
		System.out.println("Foo greets :"+d.greet());
		assertEquals("Hello World", d.greet());
	}
	
	@Test
	public void barGreets()
	{
		Bar bar = new Bar();
		assertEquals("Hello Worl", bar.greet(d));
	}
}
