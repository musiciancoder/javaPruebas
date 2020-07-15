package hilos;

public class Proceso extends Thread {
	

	

	public Proceso (String nombreThread) { //constructor obligatorio para threads!!
		
		super(nombreThread);
		
		//this.mensaje= mensaje;
	//super (mensaje);
	
	
	

	}
	
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			
		System.out.println(this.getName()); //getName retorna el nombre del thread
		//System.out.println(this.mensaje);  //da null
			System.out.println(this.getId());
			System.out.println(this.hashCode());
		
		}
	}

}
