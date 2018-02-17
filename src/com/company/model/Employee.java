package com.company.model;

public abstract class Employee {

	private String name;
	protected double wage = 3000;
	
	public abstract double getBonus();
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public String getName() {
		return name;
	}

	public void introduceYourself() {
		System.out.println("Hi, I am an employee!");
	}

}
