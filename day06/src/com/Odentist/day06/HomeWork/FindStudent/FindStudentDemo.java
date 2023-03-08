package com.Odentist.day06.HomeWork.FindStudent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindStudentDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("张三",22));
        studentList.add(new Student("李四",26));
        studentList.add(new Student("张翠山",32));
        studentList.add(new Student("赵六",19));
        studentList.add(new Student("张三丰",103));
        studentList.add(new Student("张无忌",17));
        studentList.add(new Student("赵敏",16));

        check(studentList);

    }
    public static void check(List<Student> a){
        for (Student student : a) {
            if (student.getAge()>18) System.out.println(student.toString());
        }




    }
}
