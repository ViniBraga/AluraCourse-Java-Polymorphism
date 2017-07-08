package com.empresa.intranet;

public class SistemaInterno {

	public void autentica(Autenticavel f){
		
		int senha = 123; //Pegar valores do teclado
		
		if(f.autentica(senha)){
			System.out.println("Bem vindo ao sistema!");
		}else {
			System.out.println("Acesso negado!");
		}
		
	}
	
}
