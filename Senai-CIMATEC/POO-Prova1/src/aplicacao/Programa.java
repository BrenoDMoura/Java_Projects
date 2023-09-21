package aplicacao;

import java.util.Scanner;
import entidades.Aluno;
import entidades.Disciplina; 

public class Programa {

	public static void main(String[] args) {
		
		String codigoDisciplina; 
		String nomeDisciplina;
		int numeroAlunos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o código da disciplina: ");
		codigoDisciplina = sc.next();
	
		System.out.println("Digite o nome da disciplina:");
		nomeDisciplina = sc.nextLine();
		sc.nextLine();
		System.out.println("Informe o número de alunos: ");
		numeroAlunos = sc.nextInt();
		sc.nextLine();

		Disciplina diciplina = new Disciplina(codigoDisciplina, nomeDisciplina);
		
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite os dados do aluno: " + (i+1));
			System.out.println("Matricula : ");
			String matricula = sc.nextLine();
		
			System.out.println("Nome: ");
			String nome=sc.nextLine();
		
			System.out.println("Nota 1 : ");
			float nota1 = sc.nextFloat();

			System.out.println("Nota 2 : ");
			sc.nextLine();
			float nota2 = sc.nextFloat();
	
			System.out.println("Nota 3 : ");
			float nota3 = sc.nextFloat();
			Aluno aluno = new Aluno(matricula, nome, nota1, nota2, nota3);
			diciplina.addAluno(aluno);
			sc.nextLine();

		}
		
		System.out.println("Alunos aprovados: ");
		for(Aluno a : diciplina.mostraAprovados()) System.out.println(a);
		
		System.out.println("\nMelhor aluno: ");
		System.out.println(diciplina.achaMelhor());
		sc.close();
	}

}
