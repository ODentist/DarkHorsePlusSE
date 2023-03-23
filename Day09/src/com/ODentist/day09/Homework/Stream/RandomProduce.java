package com.ODentist.day09.Homework.Stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomProduce {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(11) + 10;
            System.out.print(arr[i]+" ");
        }
        System.out.println("--------------");
        int[] ints = Arrays.stream(arr).filter((i) -> i > 15).toArray();
        for (int s : ints) {
            System.out.println(s);
        }

    }
}
