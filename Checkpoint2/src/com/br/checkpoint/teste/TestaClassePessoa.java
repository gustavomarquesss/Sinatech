package com.br.checkpoint.teste;

import com.br.checkpoint.classes.Pessoa_fisica;
import com.br.checkpoint.classes.Pessoa_juridica;

public class TestaClassePessoa {

	public static void main(String[] args) {
		
		Pessoa_fisica testePf = new Pessoa_fisica();
		
		testePf.setCpf("362.962.538-00");
		testePf.setRg("39.157.643-4");
		
		System.out.println("CPF da Pessoa Fisica = " + testePf.getCpf());
		System.out.println("RG da Pessoa Fisica = " + testePf.getRg());
		
		Pessoa_juridica testePj = new Pessoa_juridica();
		
		testePj.setCnpj("3192381903812903");
		
		System.out.println("CNPJ da Pessoa Juridica = " + testePj.getCnpj());

	}

}
