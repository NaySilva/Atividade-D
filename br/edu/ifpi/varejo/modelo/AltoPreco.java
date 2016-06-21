package br.edu.ifpi.varejo.modelo;

public class AltoPreco implements Promocao{
	
	

	@Override
	public double valorDoDesconto(Compra compra) {
		double total = compra.getTotal();
		double resultado = (total >= 1000) ? total * 0.1 : 0;
		return resultado;
	}
	

}
