package aplicacao;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException{
		File file = new File("/home/mouralitz/Área de trabalho/Coding/Java_Projects/eclipse-workspace/Q05L3/src/aplicacao/arquivodeorigem.csv");
		File resposta = new File("/home/mouralitz/Área de trabalho/Coding/Java_Projects/eclipse-workspace/Q05L3/src/aplicacao/resposta/resumo.csv");
		
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			String[] info = line.split(",");
			
			String nome = info[0];
			double preco = Double.parseDouble(info[1]);
			int quant = Integer.parseInt(info[2]);
			double total = (preco * quant);
			FileWriter fw = new FileWriter(resposta, true);
			BufferedWriter bw = new BufferedWriter(fw);
						
			bw.write(nome);
			bw.write(",");
			bw.write(String.format("%.2f", total));
			bw.newLine();
			
			bw.close();
			fw.close();
		}
		input.close();
		
		System.out.println(resposta);
}
}