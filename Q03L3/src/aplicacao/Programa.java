package aplicacao;
import entidades.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Contribuinte> MPTMD = new ArrayList<>();
		
		System.out.println("Digite o número de Contribuintes: ");
		int numeroContribuintes = input.nextInt();
		input.nextLine();
		
		for(int i = 1; i <= numeroContribuintes; i++) {
			System.out.println("\nDados do Contribuinte #" + i + ":\nPessoa física ou jurídica (f/j)? ");
			char tipoPessoa = input.next().charAt(0);
			while(tipoPessoa!='f' && tipoPessoa!='j'){
                System.out.printf("Opção Inválida!\nTente novamente: "); tipoPessoa = input.next().charAt(0);
            }
			input.nextLine();
			System.out.println("Nome: ");
			String nome = input.nextLine();
			System.out.println("Renda Anual: ");
			Double rendaAnual = input.nextDouble();
			
			switch(tipoPessoa) {
				case 'f': System.out.println("Despesas com saúde: ");
						  Double saude = input.nextDouble();
						  MPTMD.add(new Fisico(nome, rendaAnual, saude));
						  break;
				case 'j': System.out.println("Número de Empregados: ");
				  		  int empregados = input.nextInt();
				  		  MPTMD.add(new Juridico(nome, rendaAnual, empregados));
			}
		}
		input.close();
		Double impostoTotal = 0D; 
		
		System.out.println("\nIMPOSTOS PAGOS:");
		
		for(Contribuinte certinho: MPTMD) {
			impostoTotal += certinho.getImposto();
			System.out.println(certinho);			
		}
		
		System.out.println("IMPOSTOS TOTAIS: " + String.format("%.2f", impostoTotal));
	}

}
