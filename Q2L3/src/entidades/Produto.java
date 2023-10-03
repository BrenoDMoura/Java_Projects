package entidades;

public class Produto {

	public String nome;
	public Double preco;
	
	StringBuilder sb = new StringBuilder();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto()  {
		
	}
	
	public String etiqueta() {
		sb.append(nome).append("R$ ").append(String.format("%.2f", this.preco)).append("\n");
			
		return sb.toString();
		
		}
		
		public String toString() {
			return etiqueta();
		}
	
}
