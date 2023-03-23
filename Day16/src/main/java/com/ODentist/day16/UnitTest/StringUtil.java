package com.ODentist.day16.UnitTest;

public class StringUtil {
    public  static  void printLength(String s){
        System.out.println("String "+s+"'s length is "+s.length());
    }
    public static   int getIndex(String s){
        if (s==null){
            return -1;
        }
        return s.length();
    }
}
