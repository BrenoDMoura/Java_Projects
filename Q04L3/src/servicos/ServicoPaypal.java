package servicos;

public class ServicoPaypal implements ServicoPagamentoOnline{
	
	public Double taxaPagamento(Double montante) {
		return (montante + (2 * montante) / 100);
	}
	
	public Double juros(Double quantia, Integer mes) {
		return (quantia + (quantia / 100 * mes));
	}
}
