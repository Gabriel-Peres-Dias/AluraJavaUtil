package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(11,22);
		guardador.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente(22,11);
		guardador.adiciona(cc2);
		
		Conta cc3 = new ContaCorrente(11,33);
		guardador.adiciona(cc3);
		
		int tamanho = guardador.getTamanho();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(2);
		System.out.println(ref);
	}

}
