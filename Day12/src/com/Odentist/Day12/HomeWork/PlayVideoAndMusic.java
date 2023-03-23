package com.Odentist.Day12.HomeWork;

public class PlayVideoAndMusic {
    static Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                System.out.println("播放背景音乐");
            }
        }
    });
    static Thread thread2 = new Thread(() -> {
        while (true) {
            System.out.println("显示画面");
        }
    });

    //测试类

    public static void main(String[] args) {
        // 启动线程
        thread1.start();
        thread2.start();
    }
}
