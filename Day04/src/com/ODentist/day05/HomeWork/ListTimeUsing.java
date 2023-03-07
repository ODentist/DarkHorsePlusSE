package com.ODentist.day05.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class ListTimeUsing {
    public static void main(String[] args) {
        List list = new ArrayList();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("添加1至1千万这1千万个数字共耗时：" + (endTime - startTime) + "毫秒");
    }
}
