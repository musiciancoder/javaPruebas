package multithreading.interviewmaterial;

import static java.lang.Thread.MAX_PRIORITY;

public class MyThread extends Thread{ //recommended for real applications

@Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() );
    }
}

class MainClass1{
    public static void main(String[] args) throws InterruptedException{

        MyThread threadA= new MyThread();
        MyThread threadB= new MyThread();
        threadA.setPriority(MAX_PRIORITY);
        threadA.setName("mt1");
        threadA.start();


        threadB.setName("mt2");
        threadB.start();


    }
}

