package com.niit.mockito;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;



public class MocktioInjectionMockAnnotationExample {

	@Mock
	List<String> mockList;
	
	/*
	 * @InjectMock creates an instance of the class and injects the mocks that are
	 * marked with annotations @Mock into it.
	 */
	@InjectMocks
	Fruits mockFruits;
	
	@Before
	public void setup()
	{
		//if we don't call below, we will get NullPointerException
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test()
	{
		when(mockList.get(0)).thenReturn("Apple");
		when(mockList.size()).thenReturn(1);
		assertEquals("Apples",mockList.get(0));
		assertEquals(1,mockList.size());
		
		//mockFruits name is using mockList, below asserts confirm it
		assertEquals("Apple",mockFruits.getNames().get(0));
		assertEquals(1,mockFruits.getNames().size());
		
		mockList.add(1,"Mango");
		//below will print null because mockList.get(1) is not stubbed
		System.out.println(mockList.get(1));
	}

}
