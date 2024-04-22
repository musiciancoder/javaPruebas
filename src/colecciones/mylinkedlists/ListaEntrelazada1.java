package colecciones.mylinkedlists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListaEntrelazada1 {
	
	//Mas eficiente al agregar o quitar datos, no tanto en procesos de lectura
	//Admite elementos repetidos

	public static void main(String[] args) {
	
		List <String>  personas = new LinkedList<>();
		personas.add("Andres");
		personas.add("Elizabeth");
		personas.add("William");
		personas.add("Claudio");
		personas.add(2,"Edgardo");
		

     ListIterator<String>it= personas.listIterator();
	
	it.add("Ni�a"); //si lo escribe
	it.next();
	it.add("Chica");//si lo escribe
	
	for (String persona : personas) {
		System.out.println(persona);
	}
	
	System.out.println("-----------");
	
	it= personas.listIterator(); //reiniciamos iterador
	
	while (it.hasNext()) {
		String string = (String) it.next();
		System.out.println("Indice:"+it.nextIndex());
		
	}
	System.out.println("Quinto elemento: "+personas.get(4));
	System.out.println("-----------");

	personas.remove(3);
	
	it= personas.listIterator(); //reiniciamos iterador
	
	while (it.hasNext()) {
		String string = (String) it.next();
		System.out.println("Indice:"+it.nextIndex());
		
	}
	System.out.println("Quinto elemento: "+personas.get(4));
	System.out.println("Tama�o personas: " + personas.size());


	
	List <String>  personas2 = new LinkedList<>();
	personas2.add("Miguel");
	System.out.println("Tama�o personas2: " + personas2.size());
	
}
}
