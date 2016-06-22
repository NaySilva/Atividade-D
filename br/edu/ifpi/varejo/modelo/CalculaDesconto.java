package br.edu.ifpi.varejo.modelo;

public class CalculaDesconto{
	
	@Override
	public double somatorioDoDesconto(Compra compra) {
		//TODO testar somatorio do desconto com grande quantidade
		Fidelidade fd = new Fidalidade();
		AltoPreco ap = new AltoPreco();
		GrandeQuantidade gq = new GrandeQuantidade();

		compra.setTotal(compra.getTotal() - gq.valorDoDesconto(compra));
		return fd.valorDoDesconto(compra) + ap.valorDoDesconto(compra);
	}
}
