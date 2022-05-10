package Nivell_1_2;

public class Programador extends TreballadorNoPresencial{
	
	float plusMejora;

	public Programador(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
		
		plusMejora=1000;

	}
	
	public float getPlusMejora() {
		return plusMejora;
	}

	public void setPlusMejora(float plusMejora) {
		this.plusMejora = plusMejora;
	}
	
	/*
	 * @deprecated
	 * Este método ya no se utiliza para hacer el cálculo del sueldo.
	 * Utilizar calcularSou(int horesTreballades, int kilometresRecorreguts) en su lugar.
	 */
	
	@Deprecated
	
	public float calcularSouProgramador(int horesTreballades) {
		
		float sou=horesTreballades*preuHora+1000;
		
		return sou;
	}
	
	@Override
	
	public float calcularSou(int horesTreballades, int kilometresRecorreguts) {//Con la anotación Override no puedo pasar un nuevo parametro (o de un tipo diferente) pero si utilizar un atributo de mi subclase, como PLUS_MEJORA
		
		float preuKilometre=0;
		float sou=horesTreballades*preuHora+kilometresRecorreguts*preuKilometre+plusMejora+plusInternet;
		
		return sou;
	}
	
	@Override
	public void printCategoria() {
		
		System.out.println("Soy un programador.");
	}
	
	@Override
	public String toString() {
		return "Programador nombre=" + nom + " " + cognom + ".";
	}
}
