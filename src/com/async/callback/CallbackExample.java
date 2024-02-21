package com.async.callback;

import java.math.BigDecimal;
import java.util.concurrent.*;

public class CallbackExample {
    public static int compute(int data) {
        return data * 2;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> t1 = () -> {
            saveCommand("Hello call me back!", new CallbackImpl());
            return "Task1 completed";
        };
        Callable<Integer> t2 = () -> {
            saveCommand("Hello call me back!", new CallbackImpl());
            return 200;
        };
        Runnable t3 = () -> saveCommand("Hello call me back!", new CallbackImpl());
        Runnable t4 = () -> saveCommand("Hello call me back!", new CallbackImpl());
        Runnable t5 = () -> saveCommand("Hello call me back!", new CallbackImpl());

        ExecutorService pool1 = Executors.newFixedThreadPool(2);
        pool1.execute(t3);
        pool1.execute(t4);
        pool1.execute(t5);

        ExecutorService pool2 = Executors.newFixedThreadPool(2);
        Future<String> result = pool2.submit(t1);
        System.out.println("Result: ==>>>>>>" + result);
        pool2.submit(t2);
        pool2.submit(t3);
        pool2.submit(t4);
        pool2.submit(t5);
        pool1.shutdown();
        System.out.println("Main thread is sleeping");
        Thread.sleep(30000);
        System.out.println("Woke up!!");
        if (result.isDone()) {
            System.out.println("Its done now : " + result.get());
        }

        CompletableFuture.supplyAsync(() -> compute(4))
                .thenApply((data) -> data + 1)
                .thenApply(data -> data +1)
                .thenApply(data -> data * 2)
                .completeExceptionally(new RuntimeException());
        pool2.shutdown();
    }

    private static void saveCommand(String s, CallbackImpl callback) {
        System.out.println("I am saving!!");
        System.out.println("Done Successfully");
        callback.onSuccess();
    }


    private static synchronized void doNothing(String s, CallbackImpl callback) {
        System.out.println(s + "Thread Name:" + Thread.currentThread().getName());
        try {
            System.out.println(computePI(222222222));
        } catch (Exception e) {
            callback.onFailure("Failed!!");
        } finally {
            System.out.println("Finally block!!");
        }
        System.out.println();
    }

    private static synchronized double computePI(int radius) throws ArithmeticException, InterruptedException {
        System.out.println("Computing the PI");
        BigDecimal a1 = new BigDecimal(11);
        BigDecimal a2 = new BigDecimal(17);
        a1 = a1.divide(a2);
        Thread.sleep(20000);
        return Math.PI * (2 * radius) / 0;
    }

}
