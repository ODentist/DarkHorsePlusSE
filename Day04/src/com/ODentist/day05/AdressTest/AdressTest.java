package com.ODentist.day05.AdressTest;

public class AdressTest {
    static class Student{}
    static class Teacher{
        public String toString(){
            return "i am a teacher";
        }

    }

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        System.out.println(student);
        System.out.println(teacher);

    }
}
