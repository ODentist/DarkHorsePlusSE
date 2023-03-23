package com.ODentist.Day13.HomeWork.SignleAndDoubleCount;

public class SingleCount extends Thread {
    public static int a = 1;

    @Override
    public void run() {
        while (a <= 100) {
            if (a % 2 != 0) {
                synchronized (Count.lock) {
                    System.out.println(Thread.currentThread().getName() + "  " + a);
                    a += 2;
                    Count.lock.notify();
                    try {
                        Count.lock.wait();
                        if (a>100){
                            Count.lock.notifyAll();
                            break;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
