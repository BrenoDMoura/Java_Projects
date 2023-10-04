package entidades;

public class Contribuinte {
	
	protected String nome;
	protected Double rendimentoAnual;
	protected Double imposto;

	
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
	public Double getImposto() {
		return imposto;
	}
	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	public Contribuinte(String nome, Double rendimentoAnual) {
		this.nome = nome;
		this.rendimentoAnual = rendimentoAnual;
	}
	public Contribuinte() {
		
	}
	public Double impostofisico(Double rendimento, Double saude) {
		if(rendimento >= 20000D) return ((rendimento / 4) - (saude / 2));
		else return ((rendimento * 0.15) - (saude / 2));
	}
	public Double impostojuridico(Double rendimento, int funcionarios) {
		if(funcionarios > 10) return (rendimento * 14 / 100);
		else return (rendimento * 16 / 100);
	}
	
	@Override
	public String toString() {
		return (this.nome + ": R$ " + String.format("%.2f", this.imposto));
	}
	
	
}
