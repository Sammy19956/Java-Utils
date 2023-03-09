package Multithreading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    private final Map<String, Integer> votes = new HashMap<>();
    private final Lock lock = new ReentrantLock();
    public void castVote(String performer) {
        lock.lock();
        try {
            votes.compute(
                    performer, (k, v) -> (v == null) ? 1 : v + 1);
        } finally {
            lock.unlock();
        }
    }
}
