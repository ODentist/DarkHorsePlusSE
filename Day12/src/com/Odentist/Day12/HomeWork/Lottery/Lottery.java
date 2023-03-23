package com.Odentist.Day12.HomeWork.Lottery;

public class Lottery {
    public static void main(String[] args) {
        Prize prize = new Prize();
        Thread thread1= new Thread(prize);
        Thread thread2 = new Thread(prize);
        Thread thread3 = new Thread(prize);
        thread1.setName("张三");
        thread2.setName("李四");
        thread3.setName("王五");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
