package com.ODentist.DaemonThread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.setName("goddess");
        thread2.setName("spare wheel");
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }

}
