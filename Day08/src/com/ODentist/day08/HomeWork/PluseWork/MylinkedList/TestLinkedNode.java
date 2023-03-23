package com.ODentist.day08.HomeWork.PluseWork.MylinkedList;

public class TestLinkedNode {
    public static void main(String[] args) {
        MyLinklistImpl mll = new MyLinklistImpl();
        mll.add(new Student("zhangsan"));
        mll.add(new Student("lisi"));
        mll.add(new Student("wangwu"));
        mll.add(new Student("zhaoliu"));
        mll.addLast(new Student("xiaoli"));
        Student student = mll.get(3);
        System.out.println(student);

    }
}
