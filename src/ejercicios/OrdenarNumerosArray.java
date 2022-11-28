package ejercicios;

import java.util.Arrays;

public class OrdenarNumerosArray {
	
	static int numeros[] = {45,3,27,100,987};
	static int mayor;

	public static void main(String[] args) {
		
		System.out.println(NumeroMayor(numeros)); 
		Ordenar(numeros);
		
	}
	
	public static  int  NumeroMayor (int[] numeros) {
		
		for (int i = 0; i < numeros.length-1; i++) {
			if (numeros[i]>numeros[i+1]) {
				mayor = numeros[i];
			}else {
				mayor = numeros[i+1];
			}
			
		}
		return mayor;
		
	}
	
	public static  int [] Ordenar (int[] numeros) {
		
		Arrays.sort(numeros);
		for (int numero:numeros)
			  System.out.print(numero);
		
		return numeros;
		
		
		
	}
	

}
