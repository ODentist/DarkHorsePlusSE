package com.Odentist.Day12.MultipelThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Mycallable mycallable = new Mycallable();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(mycallable);
        Thread thread = new Thread(integerFutureTask);
        thread.start();

        Integer integer = integerFutureTask.get();
        System.out.println(integer);

        Mycallable mycallable1 = new Mycallable(100);
        FutureTask<Integer> integerFutureTask1 = new FutureTask<>(mycallable1);
        Thread thread1 = new Thread(integerFutureTask1);
        thread1.start();

        Integer integer1 = integerFutureTask1.get();
        System.out.println(integer1);
    }
}
