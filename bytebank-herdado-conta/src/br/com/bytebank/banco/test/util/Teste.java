package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		
		Conta cc1 = new ContaCorrente(11,11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(33,33);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(44,44);
		lista.add(cc4);
		
		// Maneira mais antiga de iterar um array
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("//------------------------------------------------------------//");
		// Maneira mais simples de iterar um array
		for(Object o : lista) {
			System.out.println(o);
		}
		
	}

}
