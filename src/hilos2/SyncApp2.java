package hilos2;


class Printer2 {
	 void printDocuments(int numOfCopies, String docName) { 
		 
		 // synchronized void printDocuments(int numOfCopies, String docName) { //con esto logramos tener los tres hilos sinconizados
		
		for (int i = 0; i < numOfCopies; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("--Printing"+docName + " "+i);
		}
	}
}

class MyThread2 extends Thread{
	
	private Printer2 pRef;
	
	MyThread2(Printer2 p){
		this.pRef = p;
	}
	
	@Override
	public void run() {
		/*synchronized (pRef) { //otra sintaxis, con esto tambien se puede syncronizar myThread2
			
		} */ pRef.printDocuments(10, "Andres.pdf");
	}
}

class YourThread2 extends Thread{
	
	private Printer2 pRef;
	
	YourThread2(Printer2 p){
		this.pRef = p;
	}
	
	@Override
	public void run() {
		pRef.printDocuments(10, "William.pdf");
	}
}

public class SyncApp2 {

	//main is representing main thread
	public static void main(String[] args) {
		
		System.out.println("==Aplication started==");
		
		Printer2 printer = new Printer2();
		
		//Scenario is that we have multiple threads working on the same Printer2 Object (resultados estan mezclados, por lo que esto no se aconseja)!!!
		//If multiple threads are going to work on the same Object, we must syncronize them
		MyThread2 myThread = new MyThread2(printer);
		YourThread2 yourThread = new YourThread2(printer);
		
		
		myThread.start();
		try {
			myThread.join(); //Sicronizacion en accion solo para el hilo myThread2!!! Con esto logramos que myThread se ejecute primeto, y luego los otros dos hilos (que como estan desinconizados siguen ejecutandose en paralelo)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yourThread.start();
		
		printer.printDocuments(10, "Mama.pdf");
		
		
		System.out.println("==Aplication finished==");

	}

}
