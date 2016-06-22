package br.edu.ifpi.varejo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	private List<Produto> itens = new ArrayList<Produto>();
	private List<Promocao> descontos = new ArrayList<Promocao>();
	private double total;
	private Cliente cliente;
	
	
	public void adicionarItem(Produto item){
		itens.add(item);
	}
	
	public void adicionarDesconto(Promocao desconto){
		descontos.add(desconto);
	}

	private void calcular(){
		for (Produto item : itens) {
			total += item.getPreco() * item.getQuantidade();
		}
	}
	
	public String nota(){
		calcular();
		double totalComDesconto = total;
		String str = "Valor total: R$" + String.valueOf(total) + "\n";
		for (Promocao desconto : descontos) {
			double valor = desconto.valorDoDesconto(this);
			str += "Desconto de R$ " + valor + "\n";
			totalComDesconto -= valor;
		}
		str += "Total Final: R$ " + totalComDesconto + "\n";
		return str;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
