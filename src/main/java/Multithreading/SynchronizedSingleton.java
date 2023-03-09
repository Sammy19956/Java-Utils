package Multithreading;

public class SynchronizedSingleton {

    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton(){}

    // First Method
    private static SynchronizedSingleton getInstance() {
        synchronized (SynchronizedSingleton.class) {
            if (singleton == null) {
                singleton = new SynchronizedSingleton();
            }
            return singleton;
        }
    }
//    Second Method;
//    private synchronized static SynchronizedSingleton getInstance() {
//            if (singleton == null) {
//                singleton = new SynchronizedSingleton();
//            }
//            return singleton;
//
//    }
}
