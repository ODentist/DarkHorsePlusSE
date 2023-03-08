package com.Odentist.day06.HomeWork;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestLevel {
    public static void main(String[] args) {
        Collection<Double> collect = Stream.of(88.5, 39.2, 77.1, 56.8, 89.0, 99.0, 59.5).collect(Collectors.toList());
        double sum=0;
        double max=-1;//collect doesn't have Get method;
        for (Double aDouble : collect) {
            System.out.println(aDouble);
            if (max<aDouble)max=aDouble;
        }
        System.out.println("-----------");
        System.out.println("less than 60");
        int count=0;
        for (Double aDouble : collect) {
            if (aDouble<60) {
                System.out.println(aDouble);
                count++;
                sum+=aDouble;
            }
        }
        System.out.println("不及格有:"+count+"个"+"不及格平均分："+sum/count+"最高分"+max);
    }
}
