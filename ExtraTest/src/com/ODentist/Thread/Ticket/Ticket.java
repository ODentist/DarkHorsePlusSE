package com.ODentist.Thread.Ticket;

public class Ticket implements Runnable {
    private static int ticket = 100;

    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {//多线程只能用一把锁
                if (ticket == 0) break;
                else {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "rest of ticket" + ticket);
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
