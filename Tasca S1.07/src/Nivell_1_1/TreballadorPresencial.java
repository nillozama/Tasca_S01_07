package Nivell_1_1;

public class TreballadorPresencial extends Treballador{

	public TreballadorPresencial(String nom, String cognom, float preuHora) {
		super(nom, cognom, preuHora);

	}

	@Override
	
	public float calcularSou(int horesTreballades, int kilometresRecorreguts) {
		
		float preuKilometre=0.2f;
		float sou=horesTreballades*preuHora+kilometresRecorreguts*preuKilometre;
		
		return sou;
	}
}
