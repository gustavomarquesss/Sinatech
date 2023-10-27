package com.br.checkpoint.teste;

import com.br.checkpoint.classes.Declaracao_imposto_renda_p_juridica;

public class TestaClasseDeclaracaoImpostoPJ {

	public static void main(String[] args) {
		

		Declaracao_imposto_renda_p_juridica testeDeclaracaoImpostoPj = new Declaracao_imposto_renda_p_juridica();
		
		testeDeclaracaoImpostoPj.setImpostos_pagos("R$327317");
		testeDeclaracaoImpostoPj.setLucro_liquido("R$3123134");
		testeDeclaracaoImpostoPj.setReceita_bruta("R$312442");
		testeDeclaracaoImpostoPj.setRegime_tributario("R$93742891");
		
		System.out.println("Impostos pagos = " + testeDeclaracaoImpostoPj.getImpostos_pagos());
		System.out.println("Lucro liquido = " + testeDeclaracaoImpostoPj.getLucro_liquido());
		System.out.println("Receita bruta = " + testeDeclaracaoImpostoPj.getReceita_bruta());
		System.out.println("Regime tributario = " + testeDeclaracaoImpostoPj.getRegime_tributario());

	}

}
