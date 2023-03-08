package com.Odentist.day06.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("JavaEE企业级开发指南");
        l1.add("Oracle高级编程");
        l1.add("MySQL从入门到精通");
        l1.add("Java架构师之路");
        System.out.println("all book");
        Iterator<String> iterator = l1.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("------------");
        Iterator<String> iterator3 = l1.iterator();
        while (iterator3.hasNext()){
            String next = iterator3.next();
            if (next.length()<10){
                System.out.println(next);
            }
        }
        System.out.println("------------");
        System.out.println("contains Java books");
        Iterator<String> iterator1 = l1.iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            if (next.contains("Java")){
                System.out.println(next);
            }
        }
        System.out.println("------------");

        System.out.println("without Oracle books :");
        Iterator<String> iterator2 = l1.iterator();

        while (iterator2.hasNext()){
            String next = iterator2.next();
            if ("Oracle".contains(next)){
                iterator.remove();
            }
            System.out.println(next);
        }
    }
}
