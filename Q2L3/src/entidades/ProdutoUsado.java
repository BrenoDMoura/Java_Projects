package entidades;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ProdutoUsado extends Produto{
	
	private Date dataFabricacao;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	StringBuilder sb = new StringBuilder();

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
		sb.append(nome).append(" (usado)").append("R$ ").append(String.format("%.2f", this.preco)).append("(Data de fabricação: ").append(sdf.format(this.dataFabricacao)).append(")\n");
			
		return sb.toString();
		
		}
		
		public String toString() {
			return etiqueta();
		}
}
