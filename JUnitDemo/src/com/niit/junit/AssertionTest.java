package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionTest {
	
	@Test
	public void testAssert()
	{
		
		//Variable declaration
		String string1 = "JUnit";
		String string2 = "JUnit";
		String string3 = "test";
		String string4 = "test";
		String string5 = null;
		
		int variable1 = 1;
		int variable2 = 2;
		int[] airthematicArray1 = {1,2,3};
		int[] airthematicArray2 = {1,2,3};
		
		//assert statements
		assertEquals(string1,string2);
		assertSame(string1,string3);
		assertNotNull(string1);
		assertNull(string5);
		assertTrue(variable1<variable2);
		assertArrayEquals(airthematicArray1,airthematicArray2);
		}
	}
	


