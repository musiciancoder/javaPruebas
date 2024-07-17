package patronesdiseno2.creational.objectpool;


public class Client {

	public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(()->new Bitmap("Logo.bmp"), 5); //Se crea un ObjectPool con 5 objetos de BitMap
	
    public static void main(String[] args) {
    	Bitmap b1 = bitmapPool.get(); //se saca el objeto del ObjectPool
    	b1.setLocation(new Point2D(10, 10)); // se ocupa para pasarle la locacion
    	Bitmap b2 = bitmapPool.get();
    	b2.setLocation(new Point2D(-10, 0));
    	
    	b1.draw();  //se ocupa para dibujar
    	b2.draw();
    	
    	bitmapPool.release(b1); //se devuelve al ObjectPool
    	bitmapPool.release(b2);
    }
}
