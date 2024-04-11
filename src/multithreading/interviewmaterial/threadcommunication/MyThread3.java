package multithreading.interviewmaterial.threadcommunication;

public class MyThread3 extends Thread{
    int total;

    @Override
    public  void run(){
        System.out.println("Child thread is calculating the sum:");
        synchronized (this) { //syncronized block
            for (int i = 1; i <=100 ; i++) {
                total +=i;
            }
            this.notify(); //notify must be on a syncronized block or syncronized method
        }
    }
}
