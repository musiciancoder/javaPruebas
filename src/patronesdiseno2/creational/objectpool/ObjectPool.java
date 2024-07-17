package patronesdiseno2.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> { //Este es el object pool para Image
	
	private BlockingQueue<T> availablePool; //bloqueante
	
	public ObjectPool(Supplier<T> creator, int count) { //el supplier (o sea la clase de la q queremos crear los object pool, q en este caso es Image) se le pasa por parametro en el cliente, al igual q el count q es el numero de ObjectPool
		availablePool = new LinkedBlockingQueue<>();
		for(int i=0; i< count;i++) {
			availablePool.offer(creator.get()); //acá se agrega los objectos al BloquinQueue
		}
	}
	
	public T get() { //el cliente llama este metodo cuando toma un onjeto del Object Pool
		try {
			return availablePool.take(); //se  quita del BlockingQueue
		}catch(InterruptedException ex) {
			System.err.println("take() was interrupted"); 
		}
		return null;
	}
	
	public void release(T obj) { //el cliente llama este metodo cuando libera un onjeto del Object Pool
		obj.reset();
		try {
			availablePool.put(obj); //se vuelve a agregar al BlockingQueue
		} catch (InterruptedException e) {
			System.err.println("put() was interrupted"); 
		}
	}
}
