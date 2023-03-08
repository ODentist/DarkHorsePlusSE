package com.Odentist.day06.HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BookList2 {


    public static void main(String[] args) {
        Collection<String> books = new ArrayList<>();
        books.add("JavaEE企业级开发指南");
        books.add("Oracle高级编程");
        books.add("MySQL从入门到精通");
        books.add("Java架构师之路");

        //使用迭代器遍历所有元素，并打印
        iteratorAndPrint(books);
        System.out.println("______________");
        //使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印
        iteratorAndPrintLessThan10(books);
        System.out.println("______________");

        //使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
        iteratorAndPrintContainsJava(books);
        System.out.println("______________");

        //如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名
        deleteAndPrintContainsOracle(books);
    }

    public static void iteratorAndPrint(Collection<String> books) {
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void iteratorAndPrintLessThan10(Collection<String> books) {
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            if (book.length() < 10) {
                System.out.println(book);
            }
        }
    }

    public static void iteratorAndPrintContainsJava(Collection<String> books) {
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            if (book.contains("Java")) {
                System.out.println(book);
            }
        }
    }

    public static void deleteAndPrintContainsOracle(Collection<String> books) {
        Iterator<String> iterator = books.iterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            if (book.contains("Oracle")) {
                iterator.remove();
            }
        }
        iteratorAndPrint(books);
    }

}
