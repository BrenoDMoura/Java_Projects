package entidades;
import java.util.ArrayList;


public class Disciplina {
	private String codigo;

	private String nome;
	
	private ArrayList<Aluno> listaAlunos = new ArrayList<>();
	
	public void addAluno(Aluno alunoadcionado) {
		listaAlunos.add(alunoadcionado);
	}
	
	
	
	public Disciplina(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}


	public ArrayList<Aluno> mostraAprovados() {
		ArrayList<Aluno> alunosAprovados = new ArrayList<>();
		for(Aluno index : listaAlunos)
			if (index.calculaMedia() >= 7) {
				alunosAprovados.add(index);
		}
		return alunosAprovados;
	}
	
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------\nCodigo - ").append(this.codigo)
                .append("\nNome da disciplina - ").append(this.nome);
           
    
        sb.append("----------------------------------------");
        return sb.toString();
    }
	
	public Disciplina(String codigo, String nome, ArrayList<Aluno> listaAlunos) {
		this.codigo = codigo;
		this.nome = nome;
		this.listaAlunos = listaAlunos;
	}

	public Aluno achaMelhor() {
		if(listaAlunos.isEmpty()) return null;
		Aluno melhor = listaAlunos.get(0);
		for(Aluno a : listaAlunos) {
			melhor = (melhor.calculaMedia() > a.calculaMedia()) ? melhor : a;
		}
		 return melhor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
