package br.edu.ifpi.varejo.modelo;

public class Fidelidade implements Promocao{

	@Override
	public double valorDoDesconto(Compra compra) {
		Cliente cliente = compra.getCliente();
		double total = compra.getTotal();
		double resultado = 0;
		if (cliente.getPontos() >= 1000) {
			cliente.retirarPontos(1000);
			resultado += total * 0.05;
		}
		return resultado;
	}

}
