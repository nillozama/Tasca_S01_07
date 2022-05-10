package Nivell_1_1;

public class Principal71 {

	public static void main(String[] args) {
		
		
		//Creamos diferentes objetos con diferentes clases de referencia para el ejemplo
		 
		Treballador treballador;//El objeto hace referencia a la clase Treballador
		Vigilant vigilant=new Vigilant("Carlos", "Perez", 10);
		Programador programador=new Programador("Juan", "Soto", 25);
		Treballador instalador=new Instalador("Francisco", "Gago", 20);
		Delineante delineante=new Delineante("Maria", "Perez", 15);

		treballador=vigilant;//Cambio el tipo de objeto al que hace referencia
		System.out.println("Sueldo= "+treballador.calcularSou(160, 200)+" euros.");//Cuando llamo al método el objeto hace referencia a la clase Vigilant
		
		System.out.println("Sueldo= "+programador.calcularSou(160, 0)+" euros.");
		System.out.println("Sueldo= "+instalador.calcularSou(160, 800)+" euros.");
		System.out.println("Sueldo= "+delineante.calcularSou(160, 100)+" euros.");
		
		
		vigilant.printCategoria();
		
		treballador=programador;
		programador.printCategoria();
		instalador.printCategoria();
		delineante.printCategoria();
	}
}
