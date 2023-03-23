package com.ODentist.Day13.HomeWork.SignleAndDoubleCount;

public class DoubleCount extends Thread {
    public static int a=0;
    @Override
    public void run() {
        while (a<=100){
            synchronized (Count.lock){
                if (a%2==0){
                    System.out.println(Thread.currentThread().getName()+"  "+a);
                    a+=2;
                    Count.lock.notify();
                    try {
                        Count.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
