package com.empresa.bonuscontrole;

import com.empresa.modelo.Funcionario;

public class TotalizadorBonus {

	private double total = 0;
	
	public void adiciona(Funcionario f){
		total += f.getBonus();
	}

	public double getTotal() {
		return total;
	}

}
