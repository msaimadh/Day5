package com.capgemini.day5.student.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.student.Student;

class StudentTest {
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
		
		
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(157784,"Saimadhuri",29,"java cloud"));

			assertThrows(NameNotValidException.class,()-> new Student(157784,"madhuri.matta8",21,"Java cloud"));
			assertAll(()-> new Student(11,"Saimadhuri",21,"Java cloud"));
		try {
			 new Student(11,"saimadhuri",21,"Java cloud");
		}
		catch(Exception e)
		{
			fail("Failed Statement");
		}
		
	}
}

