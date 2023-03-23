package com.ODentist.day08.HomeWork.DistingctNumber;

import java.util.Set;
import java.util.TreeSet;

public class DistinctNumberMethod2 {
    public static void main(String[] args) {
        double [] a={2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6};
        TreeSet<Double> s1 = new TreeSet<>();
        for (double v : a) {
            s1.add(v);
        }
        System.out.println(s1);
    }
}
