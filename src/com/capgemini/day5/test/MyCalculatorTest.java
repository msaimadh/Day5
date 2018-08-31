package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;

class MyCalculatorTest {

	@Test
	void testpowerWithValidInputs() throws Exception {
		assertEquals(243, MyCalculator.power(3,5));
		assertEquals(16, MyCalculator.power(2,4));
							
		
	}
	@Test
	void testpowerWithZeroInputs()  {
		Exception e;
		e=assertThrows(Exception.class,() ->MyCalculator.power(0,0));
		assertEquals("n and p should not be zero",e.getMessage());
	}
	@Test
	void testpowerWithNegativeInputs(){
		Exception e;
		e=assertThrows(Exception.class,() ->MyCalculator.power(-2,-5));
		assertEquals("n and p should not be negative",e.getMessage());
		e=assertThrows(Exception.class,() ->MyCalculator.power(-2,5));
		assertEquals("n and p should not be negative",e.getMessage());
		e=assertThrows(Exception.class,() ->MyCalculator.power(2,-5));	
		assertEquals("n and p should not be negative",e.getMessage());
	}

}
