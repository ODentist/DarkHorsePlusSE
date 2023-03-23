package com.ODentist.day08.Generic.TransferArray;

import java.util.StringJoiner;

public class TransferArray {
    public static void main(String[] args) {
        Integer []arr= {11,2,33};
        System.out.println(arrayToString(arr));
    }

    public static <T> String arrayToString(T [ ] arr){
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (T t : arr) {
            stringJoiner.add(t.toString());
        }
        return stringJoiner.toString();
    }
}
