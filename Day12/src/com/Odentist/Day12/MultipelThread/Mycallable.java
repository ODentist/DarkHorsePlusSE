package com.Odentist.Day12.MultipelThread;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<Integer> {
    private int num;

    public Mycallable(int num) {
        this.num = num;
    }

    public Mycallable() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Mycallable{" +
                "num=" + num +
                '}';
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 1; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
