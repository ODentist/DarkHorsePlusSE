package com.ODentist.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class  ThreadTest {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread("Thread 3");//需要继承父类的构造方法
         t1.setName("Thread 1");
         t2.setName("Thread 2");
        t1.start();
        t2.start();
/**
 * second method
 */

//        MyRunnable myRunnable = new MyRunnable();//参数对象
//        Thread thread = new Thread(myRunnable);//线程对象
//        thread.start();

//        Mycallable mycallable = new Mycallable();//线程开启之后执行call方法
//        FutureTask<String> ft = new FutureTask<>(mycallable);//返回执行完毕的结果，或者当成参数传给thread对象
//        Thread thread1 = new Thread(ft);//创建线程对象
//        thread1.start();//开启线程
//        String s = null;
//        try {
//            s = ft.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//        System.out.println(s);
    }
}
