package com.br.checkpoint.teste;

import com.br.checkpoint.classes.Razonete;

public class TestaClasseRazonete {

	public static void main(String[] args) {
		
		Razonete testeRazonete = new Razonete();
		
		testeRazonete.setCredito("R$500000");
		testeRazonete.setDebito("R$100000");
		testeRazonete.setSaldo("R$4000000");
		
		System.out.println("Crédito = " + testeRazonete.getCredito());
		System.out.println("Débito = " + testeRazonete.getDebito());
		System.out.println("Saldo = " + testeRazonete.getSaldo());

	}

}
