package com.capgemini.day5.Mydate.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.Mydate.InvalidDayException;
import com.capgemini.day5.Mydate.InvalidMonthException;
import com.capgemini.day5.Mydate.MyDate;

class MydateTest {

	@Test
	void testMyDate() {
		assertAll(()-> new MyDate(11,2,1996));
		assertAll(()-> new MyDate(01,10,1989));
		assertAll(()-> new MyDate(8,03,2003));
	}
	
	@Test
	void testInvalidDay() {
		assertThrows(InvalidDayException.class,()-> new MyDate(29,2,1997));
		assertThrows(InvalidDayException.class,()-> new MyDate(92,2,1997));
		assertThrows(InvalidDayException.class,()-> new MyDate(32,04,1997));
	}
	
	@Test
	void testInvalidMonth() {
		assertThrows(InvalidMonthException.class,()-> new MyDate(11,22,1996));
		assertThrows(InvalidMonthException.class,()-> new MyDate(29,-2,1997));
		assertThrows(InvalidMonthException.class,()-> new MyDate(29,0,1997));
	}
	

}

