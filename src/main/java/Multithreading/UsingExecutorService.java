package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {

    static ExecutorService executorService = Executors.newSingleThreadExecutor();
    static ExecutorService executorService1 = Executors.newCachedThreadPool();
    static ExecutorService executorService2 = Executors.newFixedThreadPool(12);

    public static void doExecute(Runnable runnable){
        executorService.execute(runnable);
    }

    public static void main(String[] args) {


        RunnableClass runnableClass = new RunnableClass();
        for (int i = 0; i < 10; i++) {
            UsingExecutorService.executorService2.execute(runnableClass);
        }

    }


}
