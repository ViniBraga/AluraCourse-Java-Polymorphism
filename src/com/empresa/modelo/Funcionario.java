package com.empresa.modelo;

public abstract class Funcionario {

	private String nome;
	protected double salario = 3000;
	
	public abstract double getBonus();
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void apresentarSe() {
		System.out.println("Olá, eu sou um funcionário!");
	}

}
