package com.empresa.teste;

//import static org.junit.Assert.*;

import org.junit.Test;

import com.empresa.modelo.Desenvolvedor;
import com.empresa.modelo.Funcionario;
import com.empresa.modelo.Gerente;

public class FuncionarioTeste {

	@Test
	public void TestaGerente() {
		Gerente func = new Gerente();
		func.apresentarSe();
		func.cobrarEntrega();
		System.out.println("Meu bonus: "+func.getBonus());
	}
	
	@Test
	public void TestaDesenvolvedor() {
		Funcionario func = new Desenvolvedor();
		func.apresentarSe();
		System.out.println("Meu bonus: "+func.getBonus());
	}
	
}
