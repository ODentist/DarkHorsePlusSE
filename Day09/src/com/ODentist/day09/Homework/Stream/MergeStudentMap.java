package com.ODentist.day09.Homework.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class MergeStudentMap {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三",18));
        students.add(new Student("张三",18));
        students.add(new Student("李四",19));
        students.add(new Student("王五",10));

        ArrayList<String> address= new ArrayList<>();
        address.add("北京");
        address.add("天津");
        address.add("上海");
        address.add("四川");
        Map<Student, String> studentMap = new HashMap<>();
        for (int i=0;i<address.size();i++){
            studentMap.put(students.get(i),address.get(i));
        }
        System.out.println(studentMap);
        Set<Map.Entry<Student, String>> entries = studentMap.entrySet();
        entries.stream().filter(s->s.getKey().getName().startsWith("张")).forEach(s-> System.out.println(s));
    }
}
