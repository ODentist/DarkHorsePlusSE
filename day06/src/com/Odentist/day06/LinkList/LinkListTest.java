package com.Odentist.day06.LinkList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkListTest {
    public static void main(String[] args) {
        LinkedList<String> Ll = new LinkedList<>();
        Ll.addFirst("1");
        Ll.addFirst("2");
        Ll.addFirst("3");
        Ll.addFirst("4");
        Ll.addFirst("5");
       // Ll.forEach(s-> System.out.println(s));
        Ll.forEach(System.out::println);


        LinkedList<String> stack = new LinkedList<>();
        stack.push("01");
        stack.push("02");
        stack.push("03");
        stack.push("04");
        stack.push("05");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);


        TreeSet<String> tree = new TreeSet<>();

    }
}
