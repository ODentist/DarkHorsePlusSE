package com.ODentist.day08.HomeWork.PluseWork.MylinkedList;

import java.util.LinkedList;

public class MyLinklistImpl implements MyLinkedList {
    Node head = new Node();
    Node last =head;
    @Override
    public void add(Student student) {//头插
        Node node = new Node(student);
        if (head==null){
            head=node;
            last=node;
        }else {
            node.next=head;
            head.pre=node;
        }

    }
    public void addLast(Student student){//尾插法
        Node newNode = new Node(student);
        if(head == null) {
            head = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            newNode.pre = last;
            last = newNode;
        }
    }


    @Override
    public Student get(int index) {
        Node cur = head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur.getStudent();
    }

}
