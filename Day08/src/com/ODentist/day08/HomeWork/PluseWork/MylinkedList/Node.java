package com.ODentist.day08.HomeWork.PluseWork.MylinkedList;

public class Node {
    // 记录学生对象
    private Student student;
    public  Node pre; // 前一个节点的地址
    public  Node next;// 后一个节点的地址
    public Node(Student student){
        this.student=student;
    }
    public Student getStudent(){
        return this.student;
    }
    public Node(){

    }
    public Node head;
    public Node last;

}
