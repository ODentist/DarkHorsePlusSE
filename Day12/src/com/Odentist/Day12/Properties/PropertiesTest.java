package com.Odentist.Day12.Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("zhangsan","chengdu");
        properties.setProperty("lisi","deyang");
        properties.setProperty("wangwu","mianyang");
        String value = properties.getProperty("lisi");
        System.out.println(value);
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
        }
        FileWriter fileWriter = new FileWriter("D:\\JAVA_Code\\DarkHorsePlusSE\\Day12\\src\\com\\Odentist\\Day12\\FileStorage\\properties.txt");
        properties.store(fileWriter,"abcd");

        fileWriter.close();



    }




}
