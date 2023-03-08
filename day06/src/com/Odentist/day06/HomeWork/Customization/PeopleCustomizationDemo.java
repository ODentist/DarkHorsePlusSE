package com.Odentist.day06.HomeWork.Customization;


import com.Odentist.day06.HomeWork.FindStudent.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class PeopleCustomizationDemo {
    public static void main(String[] args) {
        ArrayList<People> students = new ArrayList<>();
        students.add(new People(18,"studen1",1.80));
        students.add(new People(28,"studen2",1.55));
        students.add(new People(38,"studen3",1.54));
        students.add(new People(48,"studen4",1.47));
        students.add(new People(58,"studen5",1.56));

        MaxHeight(students);
        MinHeight(students);
    }
    public  static void MaxHeight(ArrayList<People> students){
        Iterator<People> iterator = students.iterator();
        People people1 = new People();
        People people2 = new People();
        people1.setHeight(0);
        while (iterator.hasNext()){
            people2=iterator.next();
            if (people1.getHeight()<people2.getHeight())
                people1=people2;
        }
        System.out.println(people1.toString());
    }

    public  static void MinHeight(ArrayList<People> students){
        Iterator<People> iterator1 = students.iterator();
        People people3 = new People();
        People people4 = new People();
        people3.setHeight(iterator1.next().getHeight());
        while (iterator1.hasNext()){
            people4=iterator1.next();
            if (people3.getHeight()>people4.getHeight())
                people3=people4;
        }
        System.out.println(people3.toString());
    }
}
