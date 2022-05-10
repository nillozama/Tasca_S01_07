package Nivell_1_2;

public class Vigilant extends TreballadorPresencial{
	
	float plusPeligrosidad;

	public Vigilant(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
		
		plusPeligrosidad=500;

	}
	
	/*
	 * @deprecated
	 * Este método ya no se utiliza para obtener el plus peligrosidad.
	 * Utilizar getPlusPeligrosidad() en su lugar.
	 */
	
	@Deprecated
	
	public float obtenerPlusPeligrosidad() {
		
		return plusPeligrosidad;
	}

	public float getPlusPeligrosidad() {
		
		return plusPeligrosidad;
	}
	
	public void setPlusPeligrosidad(float plusPeligrosidad) {
		
		this.plusPeligrosidad=plusPeligrosidad;
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
