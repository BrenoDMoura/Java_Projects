package entidades;

public class Contribuinte {
	
	protected String nome;
	protected Double rendimentoAnual;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getRendimento() {
		return rendimentoAnual;
	}
	public void setRendimento(Double rendimento) {
		this.rendimentoAnual = rendimento;
	}
	
	public Contribuinte(String nome, Double rendimentoAnual) {
		this.nome = nome;
		this.rendimentoAnual = rendimentoAnual;
	}
	public Contribuinte() {
		
	}
	public Double imposto() {
		return 0.0;
	}
	
	
	@Override
	public String toString() {
		return (this.nome + ": R$ " + String.format("%.2f", imposto()));
	}
	
	
}
