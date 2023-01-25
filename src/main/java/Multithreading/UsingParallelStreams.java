package Multithreading;

import Entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class UsingParallelStreams {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Student student = new Student("John", 22);
        Student studen1 = new Student("Simon", 20);

        List<Student> students = new ArrayList<>(List.of(student, studen1));

        System.out.println(getMap(students).get());
    }
    static Future<Map<Integer, Long>> getMap(List<Student> students){
        ForkJoinPool pool = new ForkJoinPool();
        Future<Map<Integer, Long>> mapFuture = pool.submit(
                () -> students.parallelStream() // List#stream().parallel() would also work
                        .collect(Collectors.groupingByConcurrent(Student::getAge, Collectors.counting()))
        );
        pool.shutdown();
        return mapFuture;
    }
}
