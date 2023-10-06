package aplicacao;
import entidades.*;
import servicos.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: \nNúmero: ");
		int numero = input.nextInt();
		input.nextLine();
		System.out.println("Data (dd/MM/yyy): "); String data = input.nextLine();
		System.out.println("Valor do contrato: "); Double valor = input.nextDouble();
		System.out.println("Entre com o número de parcelas: "); int numParcela = input.nextInt();
		
		Date date = sdf.parse(data);
		ServicoContrato sc = new ServicoContrato();
		Contrato contrato = new Contrato(numero, date, valor);
		sc.processarContrato(contrato, numParcela);
		System.out.println("Parcelas: \n" + contrato);
		
		input.close();
	}
}
