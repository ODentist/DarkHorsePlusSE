package com.ODentist.Thread.ProductionAndConsumption;

public class Cook extends Thread{
    //判断桌子上有没有汉堡
    //有就等待，没有就生产
    //把汉堡放桌子上
    //叫Foodie来吃

    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0) {
                    break;
                }else {
                    if (!Desk.flag){
                        //生产
                        System.out.println("cook is cooking a hamburg");
                        Desk.flag=true;
                        Desk.lock.notifyAll();
                    }else {
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
