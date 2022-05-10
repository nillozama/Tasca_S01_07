package Nivell_1_1;

public class Vigilant extends TreballadorPresencial{

	public Vigilant(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);

	}

	@Override
	public void printCategoria() {
		
		System.out.println("Soy un vigilante.");
	}
	
	@Override
	public String toString() {
		return "Vigilante nombre=" + nom + " " + cognom + ".";
	}
	
}
