package com.capgemini.day5;

import org.junit.jupiter.api.function.Executable;

import com.capgemini.day5.test.EmployeeNameInvalidException;
import com.capgemini.day5.test.TaxNoteligibleException;

public class TaxCalculator {

	public static double calculateTax(String emplyoeeName,boolean isIndian,double employeeSal) throws EmployeeNameInvalidException,CountryNotValidException,TaxNoteligibleException {
		double tax = 0;
		if(isIndian == false) {
			throw new CountryNotValidException("not an Indian");
		}
		else if(emplyoeeName==null||emplyoeeName.equals(""))
		{
			throw new EmployeeNameInvalidException("employee name cannot be empty");
		}
		
		else
		{
		
		if(employeeSal>100000)
		{
			tax=(employeeSal*8)/100;
		}
		else if(employeeSal>50000 && employeeSal<=100000)
		{
			tax=(employeeSal*6)/100;
		}
		else if(employeeSal>30000 && employeeSal<=50000)
		{
			tax=(employeeSal*5)/100;
		}
		else if(employeeSal>10000 && employeeSal<=30000)
		{
			tax=(employeeSal*4)/100;
		}
		else {
		return tax;
	}
}
		return tax;
	}
}

	
	



