package Nivell_1_1;

public class Treballador {
	
	String nom;
	String cognom;
	float preuHora;
	
	public Treballador(String nom, String cognom, float preuHora) {
		
		this.nom=nom;
		this.cognom=cognom;
		this.preuHora=preuHora;
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

	public float getPreuHora() {
		return preuHora;
	}

	public void setPreuHora(float preuHora) {
		this.preuHora = preuHora;
	}
	
	public float calcularSou(int horesTreballades, int kilometresRecorreguts) {
		
		float preuKilometre=0;
		float sou=horesTreballades*preuHora+kilometresRecorreguts*preuKilometre;
		
		return sou;
	}
	
	public void printCategoria() {
		
		System.out.println("Soy un trabajador");
	}

	@Override
	public String toString() {
		return "Treballador [nom=" + nom + ", cognom=" + cognom + ", preuHora=" + preuHora + "]";
	}
}
