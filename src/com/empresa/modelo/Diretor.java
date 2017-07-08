package com.empresa.modelo;

import com.empresa.intranet.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel{

	private int senha = 123;
	
	public void apresentarSe() {
		System.out.println("Olá, eu sou um Diretor!");
	}
		
	public double getBonus(){
		return this.salario * 0.4;
	}

	public boolean autentica(int senha) {
		return this.senha == senha;
	}
}
