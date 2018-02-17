package com.company.model;

import com.company.intranet.Authentic;

public class Director extends Employee implements Authentic{

	private int pass = 123;
	
	public void introduceYourself() {
		System.out.println("Hi, I am a Director!");
	}
		
	public double getBonus(){
		return this.wage * 0.4;
	}

  @Override
  public boolean authenticate(int pass) {
    return this.pass == pass;
  }
  
}
