package com.niit.mockito;

import static org.junit.Assert.*;

import java.util.*;
import static org.mockito.Mockito.*;



import org.junit.Test;
import org.mockito.Spy;


public class MockitoSpyMethodExample {

	@Spy
	List<String> spyOnList;
	
	@Test
	public void test()
	{
		List<String> list = new ArrayList<>();
		spyOnList = spy(list);
		
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10,spyOnList.size());
		
		//calling real methods since below methods are not stubbed
		spyOnList.add("Pankaj");
		spyOnList.add("Meghna");
		assertEquals("Pankaj",spyOnList.get(0));
		assertEquals("Meghna",spyOnList.get(1));
		
		System.out.println(spyOnList.get(0));
		System.out.println(spyOnList.get(1));
	}

}
