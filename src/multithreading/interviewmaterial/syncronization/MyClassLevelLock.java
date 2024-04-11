package multithreading.interviewmaterial.syncronization;

public class MyClassLevelLock {
//ClassLevelLock-->with syncronized + static we get a ClassLevelLock, which means that synchronized method can only be used by one thread at a time.
    //Esto es para nosotros, no para la entrevista: Con Syncronized solo sin static no funciona, ya que permite ocupar a los dos hilos este metodo simultaneamente
    public synchronized static void sayHello(String name){
        for (int i = 0; i <=10 ; i++) {
            System.out.println("How are you, " + name);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Test implements Runnable{

    @Override
    public void run() {
        MyClassLevelLock ms = new MyClassLevelLock();
        MyClassLevelLock.sayHello(Thread.currentThread().getName());
    }
}

class MainClass3 {
    public static void main(String[] args) {
        Test testX = new Test();
        Test testY = new Test();
        Thread threadX = new Thread(testX);
        Thread threadY = new Thread(testY);
        threadX.setName("threadX");
        threadY.setName("threadY");
        threadX.start();
        threadY.start();
    }
}
