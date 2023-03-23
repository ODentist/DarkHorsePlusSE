package com.ODentist.day08.TestHashMap;

import java.util.Arrays;

public class ChangeableNumber {
    public static void main(String[] args) {
        test();
        test(1);
        test(new int[]{1,3,5,66,443,24});
    }
    public static void test(int... num){
        System.out.println(num.length);
        System.out.println(Arrays.toString(num));
        System.out.println("------------");

    }
}
