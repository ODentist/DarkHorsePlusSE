package com.ODentist.Day13.HomeWork.Type2SDC;

public class MyRunnable {
    public static int a = 0;

    public synchronized void singleCount() throws InterruptedException {
        while (a <= 100) {
            if (a % 2 == 1) {
                this.notifyAll();
                System.out.println(Thread.currentThread().getName() + "  " + a);
                a++;
            } else {
                this.wait();
            }
        }
    }

    public synchronized void doubleCount() throws InterruptedException {
        while (a <= 100) {
            if (a % 2 == 0) {
                this.notifyAll();
                System.out.println(Thread.currentThread().getName() + "  " + a);
                a++;
            } else {
                this.wait();
            }
        }
    }
}
