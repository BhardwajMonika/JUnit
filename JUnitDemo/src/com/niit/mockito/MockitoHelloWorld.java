package com.niit.mockito;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MockitoHelloWorld {

	@Test
	public void demoGreets()
	{
		Demo d = mock(Demo.class); //creating mock demo object
		when(d.greet()).thenReturn("HELLO_WORLD"); //adding behaviour
		System.out.println("Demo greets : "+d.greet());
		assertEquals(d.greet(),"HELLO_WORLD");
	}

}
