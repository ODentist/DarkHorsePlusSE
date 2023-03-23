package com.ODentist.Day13.ThreadPool;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
//                3,
//                5,
//                6,
//                TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(4),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
//                );
//        PoolRunnable poolRunnable = new PoolRunnable();
//        threadPoolExecutor.execute(poolRunnable);//major
//        threadPoolExecutor.execute(poolRunnable);
//        threadPoolExecutor.execute(poolRunnable);
//
//        threadPoolExecutor.execute(poolRunnable);//queue
//        threadPoolExecutor.execute(poolRunnable);
//        threadPoolExecutor.execute(poolRunnable);
//        threadPoolExecutor.execute(poolRunnable);
//
//        threadPoolExecutor.execute(poolRunnable);//assisted
//        threadPoolExecutor.execute(poolRunnable);
//
//        threadPoolExecutor.execute(poolRunnable);//AbortPolicy
//        threadPoolExecutor.execute(poolRunnable);
//        threadPoolExecutor.execute(poolRunnable);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(3,
                5,
                6,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        MyCallable myCallable1 = new MyCallable(100);
        MyCallable myCallable2 = new MyCallable(150);
        MyCallable myCallable3 = new MyCallable(200);
        MyCallable myCallable4 = new MyCallable(250);
        MyCallable myCallable5 = new MyCallable(300);

        Future<Integer> submit1 = threadPoolExecutor2.submit(myCallable1);
        Future<Integer> submit2 = threadPoolExecutor2.submit(myCallable2);
        Future<Integer> submit3 = threadPoolExecutor2.submit(myCallable3);
        Future<Integer> submit4 = threadPoolExecutor2.submit(myCallable4);
        Future<Integer> submit5 = threadPoolExecutor2.submit(myCallable5);

        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());
        System.out.println(submit4.get());
        System.out.println(submit5.get());
        threadPoolExecutor2.shutdown();

    }
}
