package com.ODentist.day05.Throw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeExcption {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input your age");
            int i = scanner.nextInt();

            saveAge(i);
        } catch (AgeOutOfBoundsException e) {
            System.out.println("simulate the browser"+e.getMessage());
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("you are not input a number");
            e.printStackTrace();
        }
    }
    public static void saveAge(int age){
        if(age>=1&&age<=150){
            System.out.println("age:"+age+"saved");
        }else {
            throw new ArrayIndexOutOfBoundsException("your age should be between 1 and 150 years-old");
        }
    }
}
