package mystreams.threads;

public class ThreadsWithSteams {

    public static void main(String[] args) {

        //Runnable r = new MyRunnableImpl();
        //Thread t = new Thread(r);
        //t.start();


        Runnable r = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread thread = new Thread(r);
        thread.start();

        //main thread
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Main Thread");
        }
    }
}