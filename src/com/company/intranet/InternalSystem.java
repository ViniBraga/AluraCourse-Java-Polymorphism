package com.company.intranet;

public class InternalSystem {

	public void autentica(Authentic f){
		
		int pass = 123; //Get values from the keyboard...
		
		if(f.authenticate(pass)){
			System.out.println("Welcome to the system!");
		}else {
			System.out.println("Access denied!");
		}
		
	}
	
}
