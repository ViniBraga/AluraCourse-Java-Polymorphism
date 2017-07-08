package com.empresa.modelo;

import com.empresa.intranet.Autenticavel;

public class Cliente implements Autenticavel{

	private String nome;
	private String endereco;
	private int senha = 123;
	//...
	
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	
	
}
