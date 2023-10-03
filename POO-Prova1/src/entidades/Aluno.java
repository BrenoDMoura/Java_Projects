package entidades;

public class Aluno {
	private String matricula, nome;
	private Float nota1, nota2, nota3;
	private Float media;
	
	public Aluno(String matricula, String nome, Float nota1, Float nota2, Float nota3, Float media) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = media;
	}
	
	
	
    public Aluno(String matricula, String nome, Float nota1, Float nota2, Float nota3) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}



	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matricula = ").append(this.matricula)
                .append(" - Nome = ").append(this.nome)
                .append(" - Media = ").append( (this.nota1 + this.nota2 + this.nota3) / 3);
    
     
        return sb.toString();
    }
	
	public Aluno() {
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getNota1() {
		return nota1;
	}

	public void setNota1(Float nota1) {
		this.nota1 = nota1;
	}

	public Float getNota2() {
		return nota2;
	}

	public void setNota2(Float nota2) {
		this.nota2 = nota2;
	}

	public Float getNota3() {
		return nota3;
	}

	public void setNota3(Float nota3) {
		this.nota3 = nota3;
	}

	public Float getMedia() {
		return media;
	}

	public Float calculaMedia() {
		return ((this.nota1 + this.nota2 + this.nota3) / 3);	
	}
	
	public void setMedia(Float media) {
		this.media = media;
	}
	
}
