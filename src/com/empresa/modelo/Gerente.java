package com.empresa.modelo;

import com.empresa.intranet.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha = 123;

	public void apresentarSe() {
		System.out.println("Olá, eu sou um gerente!");
	}
	
	public void cobrarEntrega() {
		System.out.println("Está pronto?");
	}
	
	public double getBonus(){
		return this.salario * 0.3;
	}

	public boolean autentica(int senha) {
		return this.senha  == senha;
	}
	
}
