package com.ODentist.day08.HomeWork.LinkedList;

import java.util.Iterator;

public class MyLinkedListImpl implements MyLinkedList,Iterable<Student>{
    private Node head=null;
    private Node last=null;

    public MyLinkedListImpl(){
        head=new Node(null,new Student("StudentFirst"),null);
        last=new Node(null,new Student("StudentFirst"),null);
        head.next=last;
        last.prev=head;
    }
    private Node findNode(int index){
        int i=-1;
        for (Node p=head;p!=last;p=p.next,i++){
            if (i==index){
                return p;
            }
        }
        return null;
    }
    @Override
    public void addFirst(Student student) {
        //链表为空
       insert(0,student);

    }
    public void insert(int index,Student student){
        Node PrevNode=findNode(index-1);
        Node NextNode=PrevNode.next;
        Node newNode = new Node(PrevNode, student, NextNode);
        PrevNode.next=newNode;
        NextNode.prev=newNode;
    }
    public void addLast(Student student){
        Node tail = last.prev;
        Node node = new Node(tail, student, last);
        tail.next=node;
        last.prev=node;

    }


    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            Node p=head.next;
            @Override
            public boolean hasNext() {
                return p!=last;
            }

            @Override
            public Student next() {
                Student student = p.student;
                p=p.next;
                return student;
            }
        };
    }
}
