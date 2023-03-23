package com.Odentist.Day12.MultipelThread;

public class CurrentThread {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.setName("thread1");
        myThread2.setName("thread2");

        myThread1.start();
        myThread2.start();
    }
}
