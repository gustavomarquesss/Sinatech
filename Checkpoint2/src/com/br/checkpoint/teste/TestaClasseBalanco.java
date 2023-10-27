package com.br.checkpoint.teste;

import com.br.checkpoint.classes.Balanco;

public class TestaClasseBalanco {

	public static void main(String[] args) {

		
		Balanco testeBalanco = new Balanco();
		
		testeBalanco.setAtivos("R$552253");
		testeBalanco.setLucro("R$9847918");
		testeBalanco.setPassivos("R$231314");
		testeBalanco.setPrejuizo("R$00000");
		testeBalanco.setReceitas("R$3123452");
		
		System.out.println("Ativos = " + testeBalanco.getAtivos());
		System.out.println("Lucro = " + testeBalanco.getLucro());
		System.out.println("Passivos = " + testeBalanco.getPassivos());
		System.out.println("Prejuízo = " + testeBalanco.getPrejuizo());
		System.out.println("Receitas = " + testeBalanco.getReceitas());

	}

}
