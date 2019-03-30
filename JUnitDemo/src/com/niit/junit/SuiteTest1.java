package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest1 {

	public String message="nisha";
	JUnitMessage junitMessage = new JUnitMessage(message);

	@Test /* (expected = ArithmeticException.class) */  
	public void testJUnitMessage() {
		System.out.println("Junit Message is printing");
		junitMessage.printMesage();
	}
@Test
public void testJUnitHiMessage()
{
	message = "Hi" + message;
	System.out.println("JUnit hi message is printing");
	assertEquals(message, junitMessage.printHiMessage());
	System.out.println("suite test 1 is successfull" + message);
}
}
