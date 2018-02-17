package com.company.bonuscontrol;

import com.company.model.Employee;

public class BonusTotalizer {

	private double total = 0;
	
	public void add(Employee f){
		total += f.getBonus();
	}

	public double getTotal() {
		return total;
	}

}
