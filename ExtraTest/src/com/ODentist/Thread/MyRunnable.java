package com.ODentist.Thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.println("second method to star thread"+i);
        }
    }
}
