package com.Odentist.Day12.Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPorperties {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\JAVA_Code\\DarkHorsePlusSE\\Day12\\src\\com\\Odentist\\Day12\\FileStorage\\properties.txt");
        Properties properties = new Properties();
        properties.load(fileReader);
        fileReader.close();


        for (String stringPropertyName : properties.stringPropertyNames()) {
            System.out.println(stringPropertyName+properties.getProperty(stringPropertyName));
        }

    }
}
