package com.ODentist.day05.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyBoardInput {

    public static void main(String[] args){
        System.out.println("通过工具类得到的整数是:"+getInt());
        System.out.println("通过工具类得到的小数是:"+getDouble());
        System.out.println("通过工具类得到的字符串是:"+getString());
    }
    // 获取用户输入的整数
    public static int getInt() {
        int num = 0;
        while (true) {
            try {
                System.out.println("请输入一个整数：");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                num = Integer.parseInt(br.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("您输入的不是整数，请重新输入！");
            }
        }
        return num;
    }

    // 获取用户输入的小数
    public static double getDouble() {
        double num = 0.0;
        while (true) {
            try {
                System.out.println("请输入一个小数：");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                num = Double.parseDouble(br.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("您输入的不是小数，请重新输入！");
            }
        }
        return num;
    }

    // 获取用户输入的字符串
    public static String getString() {
        String str = "";
        while (true) {
            try {
                System.out.println("请输入一个字符串：");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                str = br.readLine();
                break;
            } catch (IOException e) {
                System.out.println("您输入的不是字符串，请重新输入！");
            }
        }
        return str;
    }

}
