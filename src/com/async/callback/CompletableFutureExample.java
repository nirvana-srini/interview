package com.async.callback;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    // Asynchronous communication in Java
    // Non blocking IO functionality
    // Thread, Runnable, Multithreading
    public static int compute(int data) {
        if(data < 0) {
            throw new RuntimeException("Negative values are not allowed");
        }
        System.out.println("Compute method - Current Thread Name : "+ Thread.currentThread().getName());
        return data * 2;
    }

    public static void main(String[] args) {
        CompletableFuture<Void> cf = create(4)
                .thenApply((data) -> data +1)
                .exceptionally((err) -> {
                    System.out.println(err.getMessage());
                    return 1;
                })
                .thenApply((data) -> data - 1)
                .thenAccept(System.out::println)
                .thenRun(()-> System.out.println("Logging"))
                ;
        // Ok, success got to next then...
        // exception go to next exceptionally
        // Map --> then apply === map(f 1-1) => Stream<R>
        // Map --> then apply === map(f 1-n) => Stream<List<R>>
        //faltMap --> compose === map(f 1-n) => Stream<List<R>>
        // forEach(consumer) => thenAccept
        CompletableFuture<Integer> cf1 = create(2);
        CompletableFuture<Integer> cf2 = create(3);
        cf1.thenCombine(cf2, Integer::sum).thenAccept(System.out::println);
        //compose flatmap like
        // if your function returns data, then use thenApply
        //if your function returns CF,then use thenCompose
        cf1.thenCompose(CompletableFutureExample::create).thenAccept(System.out::println);

        System.out.println("Current Thread Name : "+ Thread.currentThread().getName());
    }

    public static CompletableFuture<Integer> create(int data) {
        return CompletableFuture.supplyAsync(()-> compute(data));
    }
}
