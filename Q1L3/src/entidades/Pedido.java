package entidades;
import entidades.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Pedido {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private StatusPedido status;
	
	private ArrayList<ItensPedido> itens = new ArrayList<>();
	private Cliente cliente;
	
	
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Pedido(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}

	public Pedido() {
		
	}

	public Date getMomento() {
		return momento;
	}



	public void setMomento(Date momento) {
		this.momento = momento;
	}



	public StatusPedido getStatus() {
		return status;
	}



	public void setStatus(StatusPedido status) {
		this.status = status;
	}



	public ArrayList<ItensPedido> getItens() {
		return itens;
	}



	public void setItens(ArrayList<ItensPedido> itens) {
		this.itens = itens;
	}



	public void additem(ItensPedido item) {
		itens.add(item);
	}
	
	public void removerItem(ItensPedido item) {
		itens.remove(item);
	}
	
	public Double total() {
		Double counter = 0.0;
		
		for(ItensPedido certinho: itens) {
			counter += certinho.getPreco();
		}
		
		
		return counter;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("RESUMO DO PEDIDO:\nMomento do pedido: ").append(sdf.format(this.momento)).append("\n")
		.append("Status do pedido: ").append(this.status).append("\n")
		.append("Cliente: ").append(this.cliente).append("\n\nItens Pedido: \n");
		
		for(ItensPedido certinho: itens) sb.append(certinho).append("\n");
		
		sb.append("Valor total: R$ ").append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
