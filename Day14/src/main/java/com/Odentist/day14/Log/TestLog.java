package com.Odentist.day14.Log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class TestLog {
    private  static final Logger LOGGER= LoggerFactory.getLogger(TestLog.class);
    public static void main(String[] args) {
        LOGGER.info("program is running");
        System.out.println("put in a int number");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = Integer.parseInt(s);
        System.out.println("the number is"+i);
        LOGGER.info("the number is "+s);

    }
}
