package com.Odentist.Day12.HomeWork;

public class CalculateThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("一个线程计算10!");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("一个线程计算5!");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("一个线程计算8!");
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
