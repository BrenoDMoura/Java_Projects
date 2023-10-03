package aplicacao;
import entidades.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.ParseException;

public class Programa {
	
	public static void main(String[] agrs) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> pedidos = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite o número de produtos: ");
		int numeroProd = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= numeroProd; i++) {
			System.out.println("Dados do produto #" + i + ":\nComum, usado ou importado (c/u/i)?");
			char tipoProd = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String nomeProd = sc.nextLine();
			System.out.println("Preço: ");
			Double precoProd = sc.nextDouble();
			
			
			if(tipoProd == 'i' || tipoProd == 'I') { // Parando pra pensar agora, isso poderia ser um switch case
				System.out.println("Taxa alfandegária: ");
				Double taxaAlfProd = sc.nextDouble();
				ProdutoImportado produtoImp = new ProdutoImportado(nomeProd, precoProd, taxaAlfProd);
				pedidos.add(produtoImp);
				
			}
			if(tipoProd == 'u' || tipoProd == 'U') { // Parando pra pensar agora, isso poderia ser um switch case
				System.out.println("Data de fabricação (DD/MM/AAAA) :");
				sc.nextLine();
				String dataFabProd = sc.nextLine();
				Date dataProd = sdf.parse(dataFabProd);
				ProdutoUsado produtoUs = new ProdutoUsado(nomeProd, precoProd, dataProd);
				pedidos.add(produtoUs);				
			}
			if(tipoProd == 'c' || tipoProd == 'C') { // Parando pra pensar agora, isso poderia ser um switch case
				Produto produtoComum = new Produto(nomeProd, precoProd);
				pedidos.add(produtoComum);
			}
			
		}
		sc.close();
		System.out.println("ETIQUETAS DE PREÇO: ");
		for(Produto imprimir: pedidos) {
			System.out.println(imprimir);
		}
		
	}//Chave da Main
	
}// Chave da Public Class Programa
