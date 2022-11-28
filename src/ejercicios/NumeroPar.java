package ejercicios;

public class NumeroPar {

	private static Integer n=7;
	
	public static void main(String[] args) {
		
		NumeroPar num = new NumeroPar(); //NOTAR QUE NO SE PUEDE USAR THIS EN METODO ESTÁTICO
		num.par(n);
}
	
	public void par (Integer n) {
		
		if (n%2 ==0) {
			System.out.println("El numero " + n + " es par");
		}else {
			System.out.println("El numero " + n + " es impar");
		}
	}

}
