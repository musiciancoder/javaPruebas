package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
	
	//ArrayList es mas eficiente para lectura pero no tanto para agregar o quitar datos
	//Admite elementos repetidos

	public static void main(String[] args) {
		ArrayList <String> mariscales = new ArrayList<>();
		mariscales.add("Oudinot");
		mariscales.add("Davout");
		mariscales.add("Ney");
		mariscales.add("Davout"); //lo agrega sin problemas, con el mismo Hashcode por lo que acepta elementos repetidos
		ListIterator<String>it=mariscales.listIterator();
		for (String m : mariscales) {
			System.out.println("Mariscal" + it.nextIndex()+": "+m+"; hashcode: "+m.hashCode());
			String string = (String) it.next();
		}
		
		System.out.println("");
		
		ArrayList <ArrayList2> mariscales2 = new ArrayList<>();
		mariscales2.add(new ArrayList2("Lannes"));
		mariscales2.add(new ArrayList2("Bessieres"));
		mariscales2.add(new ArrayList2("Lannes"));

		
	ListIterator<ArrayList2>it2=mariscales2.listIterator();
	for (ArrayList2 m2 : mariscales2) {
		System.out.println("Mariscal" + it2.nextIndex()+": "+m2+" hashcode: "+m2.hashCode());
		ArrayList2 string =  it2.next();
	}
	}

}
