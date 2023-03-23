package com.ODentist.day08.HomeWork.WorkServe;

import java.util.*;

public class worktest {

    public static void main(String[] args) {
        Map<Worker, String> workMap = new TreeMap<>();
        Worker worker1 = new Worker("张三", 18);
        Worker worker2 = new Worker("李四", 19);
        Worker worker3 = new Worker("王五", 20);
        Worker worker4 = new Worker("田七", 20);
        Worker worker5 = new Worker("赵六", 21);
        workMap.put(worker1,"北京");
        workMap.put(worker2,"上海");
        workMap.put(worker3,"津京");
        workMap.put(worker4,"北京");
        workMap.put(worker5,"上海");
        Worker worker = new Worker();
//        for (Map.Entry<Worker, String> workerStringEntry : workMap.entrySet()) {
//            if ("张三".equals( workerStringEntry.getKey().getName())) {
//                worker= (Worker) workerStringEntry;
//            }
//        }
//        workMap.remove(worker);
//        System.out.println(worker);
        workMap.remove(worker1);
        workMap.replace(worker2,"zhengzhou");
        for (Worker worker6 : workMap.keySet()) {
            System.out.println(worker6);
        }
        System.out.println("-----------------");
        for (Map.Entry<Worker, String> workerStringEntry : workMap.entrySet()) {
            System.out.println(workerStringEntry.getKey()+workerStringEntry.getValue());
        }


    }
}
