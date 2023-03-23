package com.ODentist.Thread.TickSynchronous;

public class Ticket implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if ("windows1".equals(Thread.currentThread().getName())) {
                boolean b = synchronousMethod();//方法锁
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (b) break;
            } else
            if ("windows2".equals(Thread.currentThread().getName())) {
                synchronized (this){//块锁
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

    private synchronized boolean synchronousMethod() {
        if (ticket == 0)
            return true;
        else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
            System.out.println(Thread.currentThread().getName() + "rest of ticket" + ticket);
            return false;
        }
    }
}
