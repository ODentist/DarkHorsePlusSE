package com.Odentist.Day12.HomeWork.Lottery;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prize implements Runnable {
    private static Object o = new Object();
    private static List<String> collect = Stream.of("电视机", "电冰箱", "电脑", "游戏机", "洗衣机", "空调", "手机", "平板电脑", "电动车", "电饭煲").collect(Collectors.toList());

    @Override
    public void run() {
        while (collect.size() > 0) {
            synchronized (o) {
                if (collect.size() == 0) break;
                Collections.shuffle(collect);
                System.out.println(Thread.currentThread().getName() + "get" + collect.get(0));
                collect.remove(0);
                try {
                    Thread.currentThread().sleep(499);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            try {
                Thread.currentThread().sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
