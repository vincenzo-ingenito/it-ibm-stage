package model;

import java.util.Objects;

import com.google.gson.annotations.Expose;

public class Utente {
	@Expose		//@Expose usato per obbligare il suo inserimento in JSON
	private String nome;		
	@Expose
	private String cognome;
	@Expose
	private String sesso;
	private transient int eta;	//Keyword transient per non inserire questo attributo in JSON
	
	public Utente(String nome) {
		this.nome = nome;
	}
	
	public Utente(String nome, String cognome, String sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
	}
	
	public Utente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public Utente(String nome, String cognome, String sesso, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.eta = eta;
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

	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}

	public String toString() {
		return nome + " " + cognome + " " + sesso + " " + eta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognome, nome, sesso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(nome, other.nome)
				&& Objects.equals(sesso, other.sesso);
	}
	
	
	
}
