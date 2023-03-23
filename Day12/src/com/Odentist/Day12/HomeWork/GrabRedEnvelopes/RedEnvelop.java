package com.Odentist.Day12.HomeWork.GrabRedEnvelopes;

public class RedEnvelop implements Runnable {
    private static int redEnvelop = 3;
    private static Object o = new Object();

    @Override
    public void run() {
        synchronized (o) {

            if (redEnvelop > 0) {
                System.out.println(Thread.currentThread().getName() + "抢到20元");
                redEnvelop--;
            } else
                System.out.println(Thread.currentThread().getName() + "未抢到");
        }
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
