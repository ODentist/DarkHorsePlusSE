package com.ODentist.Thread.ProductionAndConsumption;

public class Foodie extends Thread {
    //判断桌子上有没有汉堡
    //没有就等
    //有就吃
    //吃了，桌子上就没了，去唤醒厨子去做
    //汉堡数量减一

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.flag) {
                        System.out.println("Foodie is eating");
                        Desk.flag = false;
                        Desk.lock.notifyAll();
                        Desk.count--;
                    } else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
