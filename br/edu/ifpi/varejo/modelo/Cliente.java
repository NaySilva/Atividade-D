package br.edu.ifpi.varejo.modelo;

public class Cliente {
	
	private String nome;
	private int pontos;
	
	public void adicionarPontos(int quantidade){
		pontos += quantidade;
	}
	
	public void retirarPontos(int quantidade){
		pontos -= quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	
	
	
	

}
