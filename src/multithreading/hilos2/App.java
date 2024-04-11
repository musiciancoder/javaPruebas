//https://www.youtube.com/watch?v=TCd8QIS-2KI&t=2103s

//En los hilos el resultado depende de la JVM!!

package multithreading.hilos2;


class CA {

}

//class MyTask extends CA, Thread{->Error | Multipple inheritance isnt supported in Java
class MyTask extends CA implements Runnable {
	@Override
	public void run() {
		for (int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document " + doc + " -Printer1");

		}
	}
}

class YourTask implements Runnable {
	@Override
	public void run() {
		for (int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document " + doc + " -Printer3");

		}
	}
}

public class App {

	// main method represents main thread
	public static void main(String[] args) {

		// Job 1
		System.out.println("Application started");

		// Job 2
		// MyTask task = new MyTask(); //this is used with Thread, not runnable
		// task.executeTask();
		// task.start();

		Runnable r = new MyTask();
		Thread task = new Thread(r);
		task.start();
		//task.setDaemon(true); //con esto decimos que este hilo tiene que ejecutarse con el metodo main

		new Thread(new YourTask()).start();
		
		
		
		// Job 3
		for (int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document " + doc + " +Printer2");

		}
		// Job 4
		System.out.println("Application finished");

	}

}
