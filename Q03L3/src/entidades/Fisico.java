package entidades;

public class Fisico extends Contribuinte{
	private Double despesaSaude;

	public Double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(Double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	public Fisico(String nome, Double rendimentoAnual, Double despesaSaude) {
		super(nome, rendimentoAnual);
		this.despesaSaude = despesaSaude;
		this.imposto = impostofisico(rendimentoAnual, despesaSaude);
	}
	public Fisico() {
		
	}
}
