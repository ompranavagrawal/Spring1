package com.cg.capgemini.HelloWorld;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	@Test
	public void testAdd(){
		Calculator calc=new Calculator();
		int res = calc.add(2,4);
		Assert.assertEquals(6, res);
	}
	@Test
	public void testSubstract(){
		Calculator calc=new Calculator();
		int res= calc.substract(10,4);
		Assert.assertEquals(6, res);
	}
}
