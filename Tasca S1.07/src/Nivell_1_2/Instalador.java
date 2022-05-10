package Nivell_1_2;

public class Instalador extends TreballadorPresencial{

	public Instalador(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);

	}
	
	@Override
	public float calcularSou(int horesTreballades, int kilometresRecorreguts) {
		
		float preuKilometre=0.3f;
		float sou=horesTreballades*preuHora+kilometresRecorreguts*preuKilometre;
		
		return sou;
	}
	
	@Override
	public void printCategoria() {
		
		System.out.println("Soy un instalador.");
	}

	@Override
	public String toString() {
		return "Instalador nombre=" + nom + " " + cognom + ".";
	}
	
}
