package entidades;
import entidades.*;
import java.util.ArrayList;

public class ItensPedido {

	private Integer quantidade;
	private Double preco;
	private Produto produto;

	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public ItensPedido(Integer quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.preco = subtotal(produto);
		this.produto = produto;
	}
	public ItensPedido() {

	}

	public Double subtotal(Produto produto) {
		return (produto.getPreco() * quantidade);
	}
	@Override
	public String toString() {
		return (this.produto.getNome() + ", R$ " + String.format("%.2f", this.produto.getPreco()) + ", Quantidade: " + this.quantidade + ", Subtotal: " + String.format("%.2f", this.preco));
	}

}