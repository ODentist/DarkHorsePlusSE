package com.ODentist.day08.HomeWork.LinkedList;

import java.util.Iterator;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        myLinkedList.addFirst(new Student("stu1"));
        myLinkedList.addFirst(new Student("stu2"));
        myLinkedList.addFirst(new Student("stu3"));
        myLinkedList.addLast(new Student("stu4"));
        myLinkedList.addLast(new Student("stu5"));
        myLinkedList.addLast(new Student("stu6"));
        myLinkedList.insert(3,new Student("stu8"));
        Iterator<Student> iterator = myLinkedList.iterator();
            while (iterator.hasNext()){
                Student next = iterator.next();
                System.out.println(next.toString());
            }

    }
}
