package com.ODentist.day05.HomeWork;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {10,27,8,5,2,1,3,55,88};
        int[] newArr = new int[5];
        System.arraycopy(arr, 2, newArr, 0, 5);
        //System.arraycopy(arr,2,newArr,0,3);
        for (int i : newArr) {
            System.out.print(" "+i);
        }
    }
}
