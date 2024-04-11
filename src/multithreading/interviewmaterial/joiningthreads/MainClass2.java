package multithreading.interviewmaterial.joiningthreads;

public class MainClass2 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Executing " + Thread.currentThread().getName() + ", before starting thread4 ");
        Thread thread4 = new Thread(new MyThread4());
        thread4.start();
        thread4.setName("thread4");
        thread4.join(); //waits until thread4 is finished
        System.out.println("Executing " + Thread.currentThread().getName() + ", after starting thread4 ");
    }
}

class MyThread4 implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(3000);

            System.out.println("Executing " + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
