package entidades;
import java.util.Date;

public class ProdutoUsado {
	
	private Date dataFabricacao;

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public ProdutoUsado(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public ProdutoUsado() {
		
	}
	
	public String etiqueta() {
		
	}
}
