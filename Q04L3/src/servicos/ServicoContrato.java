package servicos;
import entidades.*;
import java.util.Calendar;


public class ServicoContrato {
	
	Calendar calendario =  Calendar.getInstance();
	ServicoPagamentoOnline spo = new ServicoPaypal();

	public void processarContrato(Contrato contrato, Integer meses) {
		calendario.setTime(contrato.getData());
		for(int i = 1; i <= meses; i++) {
			calendario.add(Calendar.MONTH, 1);
			
			contrato.addParcela(new Parcela(calendario.getTime(), spo.taxaPagamento(spo.juros(contrato.getValorTotal()/meses, i))));
		}
	}
}