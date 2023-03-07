package com.ODentist.day05.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {431, 54, 25, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7, 54,33};
        //Arrays.sort(arr);
        //Arrays.binarySearch(arr,30);
        ArrayForSort(arr);
        checkArray(arr);
    }

    public static void ArrayForSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp=a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void checkArray(int [ ] a){
        int low=0,high=a.length-1;
        int mid=a.length/2;
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();

        while (i1!=a[mid]){
            if (i1<a[mid]){
                high=mid;
                mid=(low+mid)/2;
            }
            if (i1>a[mid]){
                low=mid;
                mid=(high+mid)/2;
            }
            if (high-low<1){
                System.out.print("not find ");
                break;
            }
        }
        System.out.println(mid);

    }
}
