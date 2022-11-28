package colecciones;

import java.util.HashMap;

public class Mapa1 {

	public static void main(String[] args) {
		
		//clave-valor o clave-hashcode
		//NO acepta valores que tengan la misma clave.
		HashMap <String, Integer> personajesSeinfeld = new HashMap<String, Integer>();
		//Por defecto ordena por orden alfabético de la clave
		personajesSeinfeld.put("Jerry", 34);
		personajesSeinfeld.put("Kramer", 39);
		personajesSeinfeld.put("George", 35);
		personajesSeinfeld.put("Elaine", 29);
		personajesSeinfeld.put("Elaine", 29);
		
		System.out.println(personajesSeinfeld); //notar q no se ocupa bucle foreach para imprimir como en otras colecciones
		


		
		
		
		
		  System.out.println(personajesSeinfeld);
		  
		  personajesSeinfeld.put("Elaine", 30); //no permite agregar valores con la misma clave, lo va a reemplazar
		  
		  System.out.println(personajesSeinfeld);
		  
		  personajesSeinfeld.put("Elaine2", 29); //si permite agregar valores con el mismo valor
		  
		  System.out.println(personajesSeinfeld);
		  
		  personajesSeinfeld.replace("Elaine", 33); //reemplaza
		  
		  System.out.println(personajesSeinfeld.containsKey("Elaine"));
		  
		  personajesSeinfeld.put("Newman", 34);
		  
		  System.out.println(personajesSeinfeld);
		 
	
		
		
		
	}

}
