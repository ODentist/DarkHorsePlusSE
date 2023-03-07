package com.ODentist.day05.HomeWork;

public class Recursion {
    public static void main(String[] args) {
        int sum=0;
        recusion(0,100,0);
    }
    public static void recusion(int i,int n,int sum){
        if (i<=n) {
            sum = sum + i;
            i = i + 1;
            recusion(i,n,sum);
        }
        else
        System.out.println(sum);
    }
}
