package entities;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date data;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String email, Date data) {
		this.nome = nome;
		this.email = email;
		this.data = data;
	}

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
