package com.ODentist.Thread;

public class ThreadTest {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        t1.start();
//        t2.start();

        MyRunnable myRunnable = new MyRunnable();//参数对象
        Thread thread = new Thread(myRunnable);//线程对象
        thread.start();
    }
}
