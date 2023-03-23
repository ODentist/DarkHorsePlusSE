package com.Odentist.Day12.MultipelThread;

public class MyThread extends Thread{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(thread.getName()+"is running"+i+"times");

        }
    }
}
