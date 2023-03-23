package com.ODentist.day08.HomeWork.DistingctNumber;

import java.util.HashSet;
import java.util.Set;

public class DisTingcktNumber {
    public static void main(String[] args) {
        double [] a={2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6};
        Set<Double> s1 = new HashSet<>();
        for (double v : a) {
            s1.add(v);
        }
        System.out.println(s1);
    }
}
