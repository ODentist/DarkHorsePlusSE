package com.ODentist.day05.HomeWork;

import java.util.Scanner;

public class IntCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean flag = true;
//        while (true) {
//            try {
//                System.out.print("请输入被除数: ");
//                num1 = input.nextInt();
//                break;
//            } catch (Exception e) {
//                System.out.println("输入有误，请重新输入！");
//                input = new Scanner(System.in); // 重新创建键盘输入对象
//            }
//        }while (true) {
//            try {
//                System.out.print("请输入除数: ");
//                num2 = input.nextInt();
//                break;
//            } catch (Exception e) {
//                System.out.println("输入有误，请重新输入！");
//                input = new Scanner(System.in); // 重新创建键盘输入对象
//            }
//        }
//            System.out.println(num1 + "/" + num2 + " = " + (num1 / num2)); // 输出结果
//        }


        while(flag) {
            try {
                System.out.print("请输入被除数: ");
                num1 = input.nextInt();
                System.out.print("请输入除数: ");
                num2 = input.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("输入有误，请重新输入！");
                input = new Scanner(System.in); // 重新创建键盘输入对象
            }
        }
        System.out.println(num1 + "/" + num2 + " = " + (num1 / num2)); // 输出结果
    }


}
