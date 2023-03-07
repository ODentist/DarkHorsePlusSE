package com.ODentist.day05.HomeWork;

import java.util.Scanner;

public class IntegerPase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        Integer age = Integer.parseInt(inputArray[0]);
        Double height = Double.parseDouble(inputArray[1]);


        System.out.println("---------");
        String s="991 123 324 323 534";
        String[] s1 = s.split(" ");
        int [] Arr=new int[s1.length];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = Integer.parseInt(s1[i]);
            System.out.println(Arr[i]);

        }

        System.out.println(age);
        System.out.println(height);

    }
}
