package com.accenture.demo.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator  strCalc;


	@Before
	public void setUp(){
		strCalc = new StringCalculator();
	}

	@Test
	public void testWhenOneNumberIsUsedReturnTheSameNumber() {
      Assert.assertEquals(3, strCalc.add("3"));
	}

	@Test
	public void testWhen2NumbersAreUsedReturnValueIsSum(){
		Assert.assertEquals(9, strCalc.add("3,6"));
	}

	@Test(expected = RuntimeException.class)
	public void testWhenMOreThan2NumbersExceptionIsThrown(){
		strCalc.add("1,2,3");

	}

	@Test
	public void testWhenEmptyStringIsUsedReturnValueZero(){
		Assert.assertEquals(0, strCalc.add(""));
	}





}
