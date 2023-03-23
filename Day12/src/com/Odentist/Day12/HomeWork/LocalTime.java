package com.Odentist.Day12.HomeWork;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalTime{
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                int i = 0;
                while (i < 10) {
                    Date date = new Date();
                    long time = date.getTime();
                    String format = simpleDateFormat.format(time);
                    i++;
                    System.out.println(format);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {


                System.out.println(LocalDateTime.now().
                        format(DateTimeFormatter.
                                ofPattern("yyyy-MM-dd HH:mm:ss")));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
    }
}
