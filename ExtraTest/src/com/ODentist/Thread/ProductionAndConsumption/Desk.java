package com.ODentist.Thread.ProductionAndConsumption;

public class Desk {
    //定义一个标记
    //true桌子上有汉堡，允许吃货吃
    //false，表示桌子上没汉堡，厨子去做
    public static boolean flag=false;
    public static int count=10;
    //lock
    public static final Object lock = new Object();


}
