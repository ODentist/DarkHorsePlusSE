package com.Odentist.Day12.HomeWork.Cave;

public class CaveInitlia implements Runnable{
    public static int i=0;
    public  static Object o = new Object();
    @Override
    public void run() {
        synchronized (o){
            System.out.println(Thread.currentThread().getName()+"is enter the cave ,it is the"+i);
            i++;
        }

    }
}
