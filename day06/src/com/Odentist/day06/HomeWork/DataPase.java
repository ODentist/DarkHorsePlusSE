package com.Odentist.day06.HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPase {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2001-02-12");
        System.out.println(parse);

    }
}
