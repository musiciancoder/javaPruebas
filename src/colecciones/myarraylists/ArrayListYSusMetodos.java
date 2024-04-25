package colecciones.myarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListYSusMetodos {
	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html -->API. En general contiene los mismos métodos que List
	//ArrayList es mas eficiente para lectura pero no tanto para agregar o quitar datos
	//Admite elementos repetidos

	public static void main(String[] args) {
		//Lista modificable
		ArrayList<String> mariscales = new ArrayList<>(); //en los arrays los indices se van corriendo, si removemos nunca quedan con valor nulo
		mariscales.add("Oudinot");
		mariscales.add("Davout");
		mariscales.add("Ney");
		mariscales.add("Davout"); //lo agrega sin problemas, con el mismo Hashcode por lo que acepta elementos repetidos
		mariscales.set(0,"Lannes"); //set reemplaza un elemento, a diferencia de add que agrega un elemento
		mariscales.add("Murat");

		System.out.println("Size: " + mariscales.size());
		System.out.println(mariscales); // las listas son first-in first-out
		System.out.println("Indice 3: " + mariscales.get(3));
		mariscales.remove(1);
		//mariscales.remove();//no esta disponible sin argumentos
		System.out.println("Indice 3: " + mariscales.get(3)); //se va corriendo la lista hacia arriba
		LinkedList<String>mariscales2 = new LinkedList<>();
		mariscales2.add("Coulaincourt");
		mariscales2.add("Poniatowski");
		mariscales.addAll(3,mariscales2); //agrega una coleccion en este indice. removeAll() funciona del mismo modo
	//	mariscales2.removeRange(1,2);-->el unico metodo de ArrayList q no estaría presente en List o en Linkedlist, pero no lo agarra el IDE

		Collections.reverse(mariscales);
		System.out.println("Mariscales despues de aplicar reverse(): " + mariscales);
		Collections.sort(mariscales); //ordena en orden alfabetico, sin necesidad de usar compareTo, ya q estamos usando Strings
		System.out.println("Mariscales despues de ordenar por orden alfabetico: " + mariscales);
		System.out.println(" ");
		ListIterator<String> it = mariscales.listIterator();
		while (it.hasNext()) {
			System.out.println("Index: " + it.nextIndex());
			System.out.println("Mariscal: " + it.next());
			System.out.println("Hashcode: " + it.hashCode());

		}

	}



}
