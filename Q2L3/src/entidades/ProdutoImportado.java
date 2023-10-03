package entidades;

public class ProdutoImportado extends Produto{

	private Double taxa;
	
	StringBuilder sb = new StringBuilder();

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public ProdutoImportado(Double taxa) {
		this.taxa = taxa;
	}
	
	public ProdutoImportado() {
		
	}
		
	public Double precoTotal() {
		return (preco + taxa);
	}
	
	public String etiqueta() {
	sb.append(nome).append("R$ ").append(String.format("%.2f", precoTotal())).append("(Taxa alfandegária R$ ").append(String.format("%.2f", this.taxa)).append(")\n");
		
	return sb.toString();
	
	}
	
	public String toString() {
		return etiqueta();
	}
	
}
