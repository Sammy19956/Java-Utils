package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {

    ExecutorService executorService = Executors.newSingleThreadExecutor();
    ExecutorService executorService1 = Executors.newCachedThreadPool();
    ExecutorService executorService2 = Executors.newFixedThreadPool(5);

}
