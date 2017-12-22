package com.cnm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {

	@Test
	public void compareinteger()
	{

		int expected= 10000;
		int actual= 10000;
		Assert.assertEquals(expected, actual);
		}
		
	
	@Test
	public void comparestring()
	{

		String expected= "qwer";
		String actual= "qwer";
		Assert.assertEquals(expected, actual);
		}
	
	@Test
	public void comparedouble()
	{

		String expected= "34.5";
		String actual= "34.5";
		Assert.assertEquals(expected, actual);
		}
	
	
	}
	

