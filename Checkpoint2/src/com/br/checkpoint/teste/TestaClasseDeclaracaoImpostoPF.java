package com.br.checkpoint.teste;

import com.br.checkpoint.classes.Declaracao_imposto_renda_p_fisica;

public class TestaClasseDeclaracaoImpostoPF {

	public static void main(String[] args) {


		Declaracao_imposto_renda_p_fisica testeDeclaracaoImpostoPf = new Declaracao_imposto_renda_p_fisica();
		
		testeDeclaracaoImpostoPf.setDespesas("R$4535345");
		testeDeclaracaoImpostoPf.setRenda_bruta("R$313512");
		testeDeclaracaoImpostoPf.setRendimentos_isentos("R$87321732");
		
		System.out.println("Despesas = " + testeDeclaracaoImpostoPf.getDespesas());
		System.out.println("Renda bruta = " + testeDeclaracaoImpostoPf.getRenda_bruta());
		System.out.println("Rendimentos isentos = " + testeDeclaracaoImpostoPf.getRendimentos_isentos());

	}

}
