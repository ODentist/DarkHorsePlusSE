package com.ODentist.day16.XMLTest;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) throws DocumentException, IOException {
        SAXReader saxReader = new SAXReader();
        FileReader fileReader = new FileReader("D:\\JAVA_Code\\DarkHorsePlusSE\\Day16\\src\\main\\java\\com\\ODentist\\day16\\XMLTest\\Student.xml");
        //document class
        Document document = saxReader.read(fileReader);
        fileReader.close();
        Element rootElement = document.getRootElement();
        Attribute id = rootElement.attribute("id");
        //System.out.println(id);

        Element name = rootElement.element("name");
        String text = name.getText();
        System.out.println(text);
        Element age = rootElement.element("age");
        String text1 = age.getText();
        System.out.println(text1);
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student(text,Integer.parseInt(text1)));
        for (Student student1 : student) {
            System.out.println(student1.toString());
        }




    }
}
