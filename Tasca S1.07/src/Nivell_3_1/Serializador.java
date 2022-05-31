package Nivell_3_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador {
	
	public Serializador() {
		
		
	}
	
	@SerializaJson (fichero="Persona.json")// Asignamos a fichero el valor Persona.json , si no lo indicaramos pillaría el valor de default
	public static void serializa( String  fichero, Object object){

		ObjectOutputStream objectOutputStream;
		try {
			
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(fichero));
			objectOutputStream.writeObject(object);
			objectOutputStream.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void deserializa(){
		
		ObjectInputStream objectInputStream;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("Producte.json"));
			System.out.println(objectInputStream.readObject());
			objectInputStream.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}	
	}
}
