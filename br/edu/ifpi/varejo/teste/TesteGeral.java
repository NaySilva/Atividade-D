package br.edu.ifpi.varejo.teste;


import br.edu.ifpi.varejo.modelo.AltoPreco;
import br.edu.ifpi.varejo.modelo.Cliente;
import br.edu.ifpi.varejo.modelo.Compra;
import br.edu.ifpi.varejo.modelo.Fidelidade;
import br.edu.ifpi.varejo.modelo.GrandeQuantidade;
import br.edu.ifpi.varejo.modelo.Produto;

public class TesteGeral {
	 
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.adicionarPontos(1200);
		
		Produto p1 = new Produto();
		p1.setPreco(50.0);
		p1.setQuantidade(5);
		Produto p2 = new Produto();
		p2.setPreco(60.0);
		p2.setQuantidade(21);
		Produto p3 = new Produto();
		p3.setPreco(100.0);
		p3.setQuantidade(2);
		
		Compra com1 = new Compra();
		com1.setCliente(c1);
		com1.adicionarItem(p1);
		com1.adicionarItem(p2);
		com1.adicionarItem(p3);
		com1.adicionarDesconto(new AltoPreco());
		com1.adicionarDesconto(new GrandeQuantidade());
		com1.adicionarDesconto(new Fidelidade());
		
		System.out.println(com1.nota());
		System.out.println("Pontos final: " + c1.getPontos());
		
		Compra com2 = new Compra();
		com2.setCliente(c1);
		com2.adicionarItem(p1);
		com2.adicionarItem(p2);
		com2.adicionarItem(p3);
		com2.adicionarDesconto(new AltoPreco());
		com2.adicionarDesconto(new GrandeQuantidade());
		com2.adicionarDesconto(new Fidelidade());
		
		System.out.println(com2.nota());
		System.out.println("Pontos final: " + c1.getPontos());
		
	}

}
