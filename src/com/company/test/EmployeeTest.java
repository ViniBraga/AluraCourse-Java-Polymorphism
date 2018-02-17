package com.company.test;

//import static org.junit.Assert.*;

import org.junit.Test;

import com.company.model.Developer;
import com.company.model.Employee;
import com.company.model.Manager;

public class EmployeeTest {

	@Test
	public void TestManager() {
		Manager employee = new Manager();
		employee.introduceYourself();;
		employee.chargeDelivery();;
		System.out.println("My bonus: "+employee.getBonus());
	}
	
	@Test
	public void TestDeveloper() {
		Employee employee = new Developer();
		employee.introduceYourself();
		System.out.println("My bonus: "+employee.getBonus());
	}
	
}
