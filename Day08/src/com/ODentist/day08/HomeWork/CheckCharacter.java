package com.ODentist.day08.HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        int count1 = 1,count2=1,count3=1,count4=1;
        Map<String, Integer> map2 = new HashMap<>();
        for (char aChar : chars) {
            if (aChar>'0'&&aChar<'9'){
                    map2.put("number",count1);
                    count1++;
            }
            else if (aChar==' '){
                map2.put("space",count2);
                count2++;
            }
            else if (aChar>'A'&&aChar<'z'){
                map2.put("character",count3);
                count3++;
            }
            else {
                map2.put("else",count4);
                count4++;
            }
        }
        System.out.println(map2);
    }
}
