package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;
import com.capgemini.day5.TaxCalculator;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws EmployeeNameInvalidException,TaxNoteligibleException,CountryNotValidException, com.capgemini.day5.CountryNotValidException{
		assertEquals(16000,TaxCalculator.calculateTax("bean",true, 200000));
		assertEquals(3600,TaxCalculator.calculateTax("jack",true, 60000));
	}
	void testCalculateTaxWithInValidname() throws Exception
	{
		Exception e;
		e=assertThrows(EmployeeNameInvalidException.class,()->TaxCalculator.calculateTax(null,true,60000));
		assertEquals("Employee name cannot be empty",e.getMessage());
	}
	void testCalculatewithIneligible() throws Exception
	{
		Exception e;
		e=assertThrows(TaxNoteligibleException.class,()->TaxCalculator.calculateTax(null,true,60000));
		assertEquals("the employee doesnot need to pay tax",e.getMessage());
	}
	void testCalculateTaxWithInvalidCountry() 
	{
		Exception e;
		e=assertThrows(CountryNotValidException.class,()->TaxCalculator.calculateTax(null,false,60000));
		assertEquals("employee should be indain for tax caliculation",e.getMessage());
	}

}
