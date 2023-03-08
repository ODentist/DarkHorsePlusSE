package com.Odentist.day06.HomeWork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetTime {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(new Date());
        calender.add(Calendar.DATE,500);
        Date time = calender.getTime();
        System.out.println(time);

    }
}
