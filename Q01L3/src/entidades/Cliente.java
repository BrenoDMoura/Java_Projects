package entidades;
import entidades.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Cliente {

	private String nome, email;
	private Date DataNascimento;
	private SimpleDateFormat sdf = new SimpleDateFormat("(dd/MM/yyyy)");
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public Cliente(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		DataNascimento = dataNascimento;
	}

	public String toString() {
		return (this.nome + sdf.format(this.DataNascimento) + " - " + this.email);
	}

	public Cliente() {

	}

}