package entidades;
import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Contrato {
	
	private Integer numero;
	private Date data;
	private Double valorTotal;
	ArrayList<Parcela> lista = new ArrayList<>();
	StringBuilder sb = new StringBuilder();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Contrato(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	} 
	public Contrato() {
		
	}
	public void addParcela(Parcela parcela) {
		lista.add(parcela);
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public String toString() {
		for(Parcela certinho: lista) sb.append(sdf.format(certinho.getData())).append(" - R$").append(String.format("%.2f", certinho.getValor())).append("\n");
		return sb.toString();
	}
	 
}
