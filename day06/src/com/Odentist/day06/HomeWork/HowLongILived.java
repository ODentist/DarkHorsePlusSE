package com.Odentist.day06.HomeWork;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class HowLongILived {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String nowtime = simpleDateFormat.format(date);


        try {
            Date parse1 = simpleDateFormat.parse(nowtime);
            long time = parse1.getTime();
            Date parse = simpleDateFormat.parse("2001-02-12 :12:32:43");
            long time1 = parse.getTime();
            long l = (time - time1)/1000/60/60/24/365;
            System.out.println(l);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
