package Nivell_3_1;

import java.lang.reflect.Method;

public class Principal71_N3 {

	public static void main(String[] args) throws NoSuchMethodException {

		Persona persona=new Persona("Eva", "Fort", 1);
		
		Serializador s=new Serializador();
		Method m = s.getClass().getMethod("serializa", String.class, Object.class);
		
		SerializaJson sj= m.getAnnotation(SerializaJson.class);
		
        System.out.println("Valor por default: "+ sj.fichero() + "; Objeto a serializar: " + persona);//la anotacion es leida por la JVM

        Serializador.serializa(sj.fichero(), String.valueOf(persona));//lectura de la anotacion en el metodo serializador()
        System.out.println("Se ha creado con exito el archivo en la ublicacion especificada.");
		
	}
}
