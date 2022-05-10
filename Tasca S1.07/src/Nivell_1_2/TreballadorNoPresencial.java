package Nivell_1_2;

public class TreballadorNoPresencial extends Treballador{

	float plusInternet;

	public TreballadorNoPresencial(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);
		plusInternet=90;
	}
	
	@Override
	
	public float calcularSou(int horesTreballades, int kilometresRecorreguts) {//Con la anotación Override no puedo pasar un nuevo parametro (o de un tipo diferente) pero si utilizar un atributo de mi subclase, como PLUS_MEJORA
		
		float preuKilometre=0;
		float sou=horesTreballades*preuHora+kilometresRecorreguts*preuKilometre+plusInternet;
		
		return sou;
	}
}
