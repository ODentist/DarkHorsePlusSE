package com.ODentist.day08.HomeWork.LinkedList;

public class Node {
 public Student student;
 public Node next;
 public Node prev;
 public Node(Node prev,Student student,Node next){
    this.prev=prev;
    this.student=student;
    this.next=next;
 }
}
