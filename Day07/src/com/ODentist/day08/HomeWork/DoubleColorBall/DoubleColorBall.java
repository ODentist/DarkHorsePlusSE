package com.ODentist.day08.HomeWork.DoubleColorBall;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DoubleColorBall {
    public static void main(String[] args) {
        int [] redBall=new int[33];
        int [] blueBall=new int[16];
        initialBall(redBall);
        initialBall(blueBall);
        Set<Integer> number = new TreeSet<>();
        System.out.println(chooseBall(number,redBall,blueBall));
    }
    public static int[] initialBall(int [] ball){
        for (int i = 0; i <ball.length; i++) {
            int k=i;
            ball[i]=k+1;
        }
        return ball;
    }
    public static Set<Integer> chooseBall(Set<Integer> number,int [ ] redBall,int [] blueBall){
        Random random = new Random();
        while (number.size()!=5){
             number.add(redBall[random.nextInt(redBall.length)]);
        }
        while (number.size()!=6){
            int i = blueBall[random.nextInt(blueBall.length)];
            System.out.println("blue is"+i);
            number.add(i);
        }
        return  number;
    }
}
