package com.ODentist.day05.Clone;

public class TestStudent {
    public static void main(String[] args) {
        StudentClone studentClone = new StudentClone();
        System.out.println(studentClone);
        System.out.println("-----------");
        try {
            StudentClone clone = (StudentClone) studentClone.clone();
            System.out.println(clone.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
