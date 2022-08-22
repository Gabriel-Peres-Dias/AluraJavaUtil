package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referencias;
	private int posicaoLivre; 
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
	}

	public void adiciona(Object Object) {
		this.referencias[this.posicaoLivre] = Object;
		posicaoLivre++;
		
	}

	public int getTamanho() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int i) {
		return this.referencias[i];
	}
	
	
}
