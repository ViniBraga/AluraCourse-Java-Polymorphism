package com.company.model;

public class Developer extends Employee {

	public double getBonus(){
		return this.wage * 0.25;
	}
	
	public void introduceYourself() {
		System.out.println("Hi, I am a developer!");
	}
	
}
