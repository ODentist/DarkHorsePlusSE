package com.Odentist.day06.HomeWork.RadomChoose;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomChoose {
    public static void main(String[] args) {
        List<String> name = Stream.of("student1", "student2", "student3", "student4", "student5").collect(Collectors.toList());
        List<String> choose = Stream.of("蛙跳", "俯卧撑", "吃芥末", "学🐏叫", "喝杯酒").collect(Collectors.toList());
        Random random = new Random();

        for (String s : name) {
            int i = random.nextInt(choose.size());
            System.out.println(s+"抓阄"+choose.get(i));
        }

    }
}
