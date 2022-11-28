package colecciones;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		
		//Hashset no admite elementos repetidos siempre y cuando esté sobrescrito equals y hashcode
	
		Set<HashSet1> mascotas = new HashSet<>();
		mascotas.add(new HashSet1("chica", "gato"));
		mascotas.add(new HashSet1("adarita", "perro"));
		mascotas.add(new HashSet1("queeny", "perro"));
		mascotas.add(new HashSet1("chica", "gato")); //no lo agrega, ya que es igual al primer objeto, sin embargo si en HashSet1 no hubieramos sobrescrito equals y hashcode, si hubiera agregado este objeto
		
		for (HashSet1 m : mascotas) {
			System.out.println(m.toString() + "; hashcode: " + m.hashCode());
		}
		
		System.out.println("");
		
		
   }


	
	

}
