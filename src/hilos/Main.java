package hilos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread hilo1 = new Proceso("hilo 1");
		Thread hilo2 = new Proceso("hilo 2");
		
		hilo1.start();
		hilo2.start();
		
	}

}
