package com.ODentist.ThreadDemo;

import com.sun.corba.se.impl.orbutil.closure.Future;

import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) {
        Mycallable mycallable = new Mycallable();
        FutureTask<String> stringFutureTask = new FutureTask<>(mycallable);
        Thread thread = new Thread(stringFutureTask);
        thread.setName(" 飞机");
        thread.setPriority(10);//just a chance for take more times to use cpu
        //System.out.println(thread.getPriority());//default：5
        thread.start();



        Mycallable mycallable1 = new Mycallable();
        FutureTask<String> stringFutureTask1 = new FutureTask<>(mycallable1);
        Thread thread1 = new Thread(stringFutureTask1);
        System.out.println(thread1.getPriority());
        thread1.setPriority(5);
        //System.out.println(thread1.getPriority());//default：5
        thread1.setName("tank");
        thread1.start();
    }
}
