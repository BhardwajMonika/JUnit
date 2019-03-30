package com.niit.junit;

public class JUnitMessage {

	String m;
	JUnitMessage(String msg)
	{
		m=msg;
	}
	public String printMesage()
	{ 
		return m;
	}
	
	public String printHiMessage()
	{
		return "Hi"+m;
	}
}
