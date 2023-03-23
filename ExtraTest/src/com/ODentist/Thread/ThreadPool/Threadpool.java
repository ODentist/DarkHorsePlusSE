package com.ODentist.Thread.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"running"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"running"));
        executorService.shutdown();
    }
}
