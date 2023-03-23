package com.ODentist.day08.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NoodoesStore {
    public static void main(String[] args) {
        Map<Integer, String> noodesStore = new HashMap<>();
        noodesStore.put(101,"阿三面馆");
        noodesStore.put(102,"阿4面馆");
        noodesStore.put(103,"阿5面馆");
        noodesStore.put(104,"阿6面馆");
        noodesStore.forEach((s,k)-> System.out.println(s+"-----"+k));
        System.out.println("---------------");
        Set<Integer> integers = noodesStore.keySet();
        for (Integer integer : integers) {
            String s = noodesStore.get(integer);
            System.out.println(integer+"====="+s);
        }
        System.out.println("---------------");
        Set<Map.Entry<Integer, String>> entries = noodesStore.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"--------"+entry.getValue());

        }


    }
}
