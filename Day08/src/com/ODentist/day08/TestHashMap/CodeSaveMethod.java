package com.ODentist.day08.TestHashMap;

import java.util.*;

public class CodeSaveMethod {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        map.put(new Student("zhangsan",22),"deyang");
        map.put(new Student("zhangsan",22),"绵阳");
        map.put(new Student("李四",23),"成都");
        map.put(new Student("王五",24),"广汉");
        map.put(new Student("赵六",25),"遵义");
        Set<Student> students = map.keySet();
        for (Student student : students) {
            String s = map.get(student);
            System.out.println(student+s);

        }
        System.out.println("------------");
//        Map<Student, String> Tmap = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return  o1.getAge()-o2.getAge();
//            }
//        });

        TreeMap<Student, String> Tmap = new TreeMap<>(((o1, o2) -> {return o1.getAge()-o2.getAge();}));
        Tmap.put(new Student("zhangsan",22),"deyang");
        Tmap.put(new Student("zhangsan",22),"绵阳");
        Tmap.put(new Student("李四",22),"成都");
        Tmap.put(new Student("王五",24),"广汉");
        Tmap.put(new Student("赵六",25),"遵义");
        Set<Map.Entry<Student, String>> entries = Tmap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+entry.getValue());

        }
    }
}
