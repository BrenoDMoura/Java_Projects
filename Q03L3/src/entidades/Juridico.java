package entidades;

public class Juridico extends Contribuinte{
	
	private Integer numeroEmpregados;

	public Integer getNumeroEmpregados() {
		return numeroEmpregados;
	}

	public void setNumeroEmpregados(Integer numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}

	public Juridico(String nome, Double rendimentoAnual, Integer numeroEmpregados) {
		super(nome, rendimentoAnual);
		this.numeroEmpregados = numeroEmpregados;
	}

	
	public Juridico() {
		
	}

	@Override
	public Double imposto() {
		if(numeroEmpregados > 10) return (rendimentoAnual * 14 / 100);
		else return (rendimentoAnual * 16 / 100);
	}
	
}
