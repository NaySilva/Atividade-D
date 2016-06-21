package br.edu.ifpi.varejo.modelo;

public class GrandeQuantidade implements Promocao{
	
	@Override
	public double valorDoDesconto(Compra compra) {
		double resultado = 0;
		for (Produto p : compra.getItens()) {
			if (p.getQuantidade() >= 20){
				resultado += p.getPreco() * 0.1;
			}
		}
		return resultado;
	}

}
