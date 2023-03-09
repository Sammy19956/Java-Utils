package Multithreading.VotingApp;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadedWithCollectionsDotSychronizedHashMap {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(12);

        Map<String, Integer> votes = Collections.synchronizedMap(new HashMap<>());

        List<Future<?>> futures = new ArrayList<>(10_000);
        for (int i = 0; i < 10_000; i++) {
            futures.add(
                    executor.submit(() -> {
                        votes.compute("Larry", (k, v) -> (v == null) ? 1 : v + 1);
                    }));
        }
        for (Future<?> future : futures) {
            future.get();
        }
        executor.shutdown();

        System.out.println(votes);

        List<Integer>  list = Collections.synchronizedList(List.of(2, 3, 4,5,6));
        Set<Integer> set= Collections.synchronizedSet(Set.of(55, 44, 33, 7, 3));
        Map<Integer, Integer> map = Collections.synchronizedMap(Map.of(22, 3,55,12, 33, 66, 77, 44));
        System.out.println(set.hashCode());
    }
}
