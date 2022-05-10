package Nivell_1_1;

public class Programador extends TreballadorNoPresencial{
	
	private float plusMejora;

	public Programador(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
		plusMejora=2000;
	}
	
	public float getPlusMejora() {
		return plusMejora;
	}

	public void setPlusMejora(float plusMejora) {
		this.plusMejora = plusMejora;
	}
	
	@Override
	
	public float calcularSou(int horesTreballades, int kilometresRecorreguts) {//Con la anotación Override no puedo pasar un nuevo parametro (o de un tipo diferente) pero si utilizar un atributo de mi subclase, como PLUS_MEJORA
		
		float preuKilometre=0;
		float sou=horesTreballades*preuHora+kilometresRecorreguts*preuKilometre+plusInternet+plusMejora;
		
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
