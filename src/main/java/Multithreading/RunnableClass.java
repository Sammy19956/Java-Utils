package Multithreading;

public class RunnableClass implements Runnable{


    @Override
    public void run() {
        System.out.println("The thread "+ Thread.currentThread().getName()+ " is running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
