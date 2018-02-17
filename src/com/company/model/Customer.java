package com.company.model;

import com.company.intranet.Authentic;

public class Customer implements Authentic{

	private String name;
	private String address;
	private int pass = 123;
	//...
	
  public boolean authenticate(int pass) {
    return this.pass == pass;
  }
	
	
}
