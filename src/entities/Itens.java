package entities;

public class Itens {
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public Itens() {
		
	}

	public Itens(Integer quantidade, Double preco,String nome) {
		this.quantidade = quantidade;
		this.produto = new Produto(nome,preco);
		this.preco = this.produto.getPreco();
	}
	
	public String toString() {
		return this.produto.getNome()+", R$ "+String.format("%.2f",this.preco)+", Quantidade:"+this.quantidade+", Subtotal: R$"+String.format("%.2f",subTotal());
	}
	
	public Double subTotal() {
		return this.quantidade * this.preco;
	}
}
