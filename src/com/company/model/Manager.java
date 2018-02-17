package com.company.model;

import com.company.intranet.Authentic;

public class Manager extends Employee implements Authentic {
	
	private int pass = 123;

	public void introduceYourself() {
		System.out.println("Hi, I am a manager!");
	}
	
	public void chargeDelivery() {
		System.out.println("Ready?");
	}
	
	public double getBonus(){
		return this.wage * 0.3;
	}

  public boolean authenticate(int pass) {
    return this.pass  == pass;
  }
	
}
