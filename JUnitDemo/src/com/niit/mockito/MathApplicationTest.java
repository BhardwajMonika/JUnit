package com.niit.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

	//@InjectMocks annotations is used to create and inject the mock object
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	//@Mock annotation is used to create the mock object to be injected
	@Mock
	CalculatorService calcService;
	
	@Test
	public void testAdd()
	{
		//add the behavior of calc service to add two numbers
		when(calcService.add(10.0,20.0)).thenReturn(30.00);
		
		//test the add functionality
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0,0);
		
		//verify the behavior
		verify(calcService).add(10.0,20.0);
	}
	
}
