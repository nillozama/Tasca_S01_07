package Nivell_2_1;

import java.io.Serializable;

public class Persona implements Serializable{

	private String nom;
	private String cognom;
	private int edat;
	
	public Persona(String nom, String cognom, int edat) {
		
		this.nom=nom;
		this.cognom=cognom;
		this.edat=edat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}


	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Nom= " + nom + " " +cognom+", edat= "+edat;
	}
}
