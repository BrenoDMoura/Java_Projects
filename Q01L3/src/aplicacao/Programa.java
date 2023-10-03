package aplicacao;
import entidades.*;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Programa {

	public static void main(String[] args) throws ParseException{

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			System.out.println("Informe os dados do cliente: ");
			System.out.println("Nome: ");
			String infoNome = sc.nextLine();
			System.out.println("Email: ");
			String infoEmail = sc.nextLine();
			System.out.println("Data de nascimento: ");
			String infoData = sc.nextLine();
			Date daat = sdf.parse(infoData);
			Cliente cliente = new Cliente(infoNome, infoEmail, daat);

			System.out.println("Informe os dados do Peido: ");
			System.out.println("Status: ");
			StatusPedido infoStatus = StatusPedido.valueOf(sc.next().toUpperCase());
			System.out.println("Quantos itens para este pedido? ");
			int itens = sc.nextInt();
			sc.nextLine();
			Date dayta = new Date();
			Pedido pedidu = new Pedido(dayta, infoStatus, cliente);

			for(int j = 1; j <= itens; j++) {

				System.out.println("Informe os dados do item :" + j);
				System.out.println("Nome do produto: ");
				String nomeProduto = sc.nextLine();
				System.out.println("Preço do Produto: ");
				double precoProduto = sc.nextDouble();
				System.out.println("Quantidade: ");
				int quantProd = sc.nextInt();
				pedidu.additem(new ItensPedido(quantProd, new Produto(nomeProduto, precoProduto)));
				sc.nextLine();
			}
			sc.close();
			System.out.println(pedidu);

		}

	}