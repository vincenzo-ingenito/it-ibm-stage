package model;

public class Utente {
	private String nome;
	private String cognome;
	private String sesso;
	
	public Utente() {}
	
	public Utente(String nome, String cognome, String sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	
	public String toString() {
		return "Utente [ " + nome + " " + cognome + " ";
	}
}
