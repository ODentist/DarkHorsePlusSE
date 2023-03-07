package com.ODentist.day05.Throw;

import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Student student = new Student();
        student.setName(s);
        while (true){
            try {
                System.out.println("put in age");
                int i = scanner.nextInt();
                student.saveAge(i);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

    }
}
