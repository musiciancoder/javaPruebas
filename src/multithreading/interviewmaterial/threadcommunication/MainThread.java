package multithreading.interviewmaterial.threadcommunication;

public class MainThread {

    public static void main(String[] args) throws InterruptedException{
       MyThread3 t = new MyThread3();
       t.start();
        System.out.println("Outside synchronized (t)");

       synchronized (t){ ////syncronized block, no usa syncronized(this) porque no se ocupa this en metodos estaticos
           System.out.println("Main thread is going to wait");
           t.wait(); //wait must be on a syncronized block or syncronized method
           System.out.println("Main thread Notified");
           System.out.println(t.total);
       }

    }


}
