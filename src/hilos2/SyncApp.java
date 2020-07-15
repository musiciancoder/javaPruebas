package hilos2;


class Printer {
	void printDocuments(int numOfCopies, String docName) {
		
		for (int i = 0; i < numOfCopies; i++) {
			System.out.println("--Printing"+docName + " "+i);
		}
	}
}

class MyThread extends Thread{
	
	private Printer pRef;
	
	MyThread(Printer p){
		this.pRef = p;
	}
	
	@Override
	public void run() {
		pRef.printDocuments(10, "Andres.pdf");
	}
}

class YourThread extends Thread{
	
	private Printer pRef;
	
	YourThread(Printer p){
		this.pRef = p;
	}
	
	@Override
	public void run() {
		pRef.printDocuments(10, "William.pdf");
	}
}

public class SyncApp {

	//main is representing main thread
	public static void main(String[] args) {
		
		System.out.println("==Aplication started==");
		
		Printer printer = new Printer();
		
		//Scenario is that we have multiple threads working on the same Printer Object (resultados estan mezclados, por lo que esto no se aconseja)!!!
		MyThread myThread = new MyThread(printer);
		YourThread yourThread = new YourThread(printer);
		
		
		myThread.start();
		yourThread.start();
		
		printer.printDocuments(10, "Mama.pdf");
		
		
		System.out.println("==Aplication finished==");

	}

}
