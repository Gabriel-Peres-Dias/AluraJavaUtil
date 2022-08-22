package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		// Array Literal
		int idades[] = {22,21,23};
		System.out.println(idades[0]);

		Conta[] contas = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(123,321);
		
		contas[0] = cc1;
		ContaPoupanca cc2 = new ContaPoupanca(321,123);
		
		contas[1] = cc2;
		
		System.out.println(contas[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
		
	}

}
