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
	}
	public Fisico() {
		
	}

	@Override
	public Double imposto() {
		if(rendimentoAnual >= 20000D) return ((rendimentoAnual / 4) - (despesaSaude / 2));
		else return ((rendimentoAnual * 0.15) - (despesaSaude / 2));
	}
}
