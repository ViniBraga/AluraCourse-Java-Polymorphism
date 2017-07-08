package com.empresa.modelo;

public class Desenvolvedor extends Funcionario {

	public double getBonus(){
		return this.salario * 0.25;
	}
	
	public void apresentarSe() {
		System.out.println("Olá, eu sou um desenvolvedor!");
	}
	
}
