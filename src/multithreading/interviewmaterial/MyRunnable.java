package multithreading.interviewmaterial;

public class MyRunnable implements Runnable{ //recomended for short threads
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() );
    }
}

class MainClass2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.setName("threadA");
        thread2.setName("threadB");
        thread1.start();
        thread2.start();


    }
}
