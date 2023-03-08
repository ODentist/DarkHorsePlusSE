package com.ODentist.Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("thread is active"+i);
        }
    }
}
