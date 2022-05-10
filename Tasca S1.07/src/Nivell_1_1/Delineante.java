package Nivell_1_1;

public class Delineante extends TreballadorNoPresencial{

	public Delineante(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
		
	}
	
	@Override
	public void printCategoria() {
		
		System.out.println("Soy un delineante.");
	}
	
	@Override
	public String toString() {
		return "Delineante nombre=" + nom + " " + cognom + ".";
	}
}
