package Nivell_1_2;

public class Principal72 {
	

	public static void main(String[] args) {
		
		Programador programador=new Programador("Juan", "Soto", 25);
		Vigilant vigilant=new Vigilant("Carlos", "Perez", 10);
		
		llamadaMetodoDeprecatedConWarning(programador);
		llamadaMetodoDeprecatedSinWarning(programador);
		llamadaMetodoDeprecatedPlusPeligrosidad(vigilant);
		
	}

	public static void llamadaMetodoDeprecatedConWarning(Programador programador) {
		
		float sou;
		sou=programador.calcularSouProgramador(160);// no utilzamos @SuppressWarnings("deprecation") y salta el warning
		System.out.println(sou);
	}
	
	@SuppressWarnings("deprecation")
	public static void llamadaMetodoDeprecatedSinWarning(Programador programador) {
		
		float sou;
		sou=programador.calcularSouProgramador(160);
		System.out.println(sou);
	}
	
	@SuppressWarnings("deprecation")
	public static void llamadaMetodoDeprecatedPlusPeligrosidad(Vigilant vigilant){
		
		float plus;
		plus=vigilant.obtenerPlusPeligrosidad();
		System.out.println(plus); 
	}
}
