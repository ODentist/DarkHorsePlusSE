package com.Odentist.day06.ClassTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(0);
        System.out.println(date1);

        long time = date1.getTime();
        System.out.println(time);

        date.setTime(0);
        System.out.println(date1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
        Date parse = simpleDateFormat.parse("2022-11-02 11:22:33");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        System.out.println(parse);
        System.out.println("------------------");

        String star="2020-11-11 00:00:00";
        String end="2020-11-11 00:10:00";
        String jiaTime="2020-11-11 00:03:47";
        String piTime="2020-11-11 00:13:22";
        Date parse1 = simpleDateFormat.parse(star);
        Date parse2 = simpleDateFormat.parse(end);
        Date parse3 = simpleDateFormat.parse(jiaTime);
        Date parse4 = simpleDateFormat.parse(piTime);

        long time1 = parse1.getTime();
        long time2 = parse2.getTime();
        long time3 = parse3.getTime();
        long time4 = parse4.getTime();

        if (time3>=time1&&time2<=time4){
            System.out.println("jia  in");
        }
        else {
            System.out.println("jia not in");
        }
    }
}
