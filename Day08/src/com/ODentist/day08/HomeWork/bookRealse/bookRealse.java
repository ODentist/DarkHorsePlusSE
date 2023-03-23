package com.ODentist.day08.HomeWork.bookRealse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bookRealse {
    public static void main(String[] args) {
        Map<String, String> book = new HashMap<>();
        book.put(null,"电子工业出版社");
        book.put("异步图书","清华大学出版社");
        Map<String, String> realseTime = new HashMap<>();
        realseTime.put("往季","2019春季");
        realseTime.put(null,"2019冬季");
        HashSet<String > computerAndInternet = new HashSet<>();
        computerAndInternet.add("编程语言与程序设计及");
        computerAndInternet.add("网络与通信");
        computerAndInternet.add("数据库");
        System.out.println(book);
        System.out.println(realseTime);
        System.out.println(computerAndInternet);
    }
}
