package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enum.StatusPedido;

public class Pedido {
	private Date data;
	private StatusPedido status;
	private List <Itens> itens = new ArrayList<>();
	private Cliente cliente;
	private Double precoTotal=0.00;
	
	public Pedido() {
		
	}

	public Pedido(Date data, StatusPedido status, String nome,String email, Date dataNasc) {
		this.data = data;
		this.status = status;
		this.cliente = new Cliente(nome,email,dataNasc);
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void getItens() {
		for(Itens x: itens) {
			System.out.println(x.toString());
			this.precoTotal += x.subTotal();
		}
		System.out.println("Preço total: R$ "+String.format("%.2f",this.precoTotal));
	}
	
	public void addItens(Itens iten) {
		this.itens.add(iten);
	}
}
