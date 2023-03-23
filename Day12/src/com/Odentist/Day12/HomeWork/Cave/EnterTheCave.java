package com.Odentist.Day12.HomeWork.Cave;

import java.util.ArrayList;

public class EnterTheCave {
    public static void main(String[] args) throws InterruptedException {
        CaveInitlia caveInitlia = new CaveInitlia();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i=0;i<10;i++){
            threads.add(new Thread(caveInitlia));
        }
        for (Thread thread : threads) {
            Thread.currentThread().sleep(1000);//
            thread.start();

        }
    }
}
