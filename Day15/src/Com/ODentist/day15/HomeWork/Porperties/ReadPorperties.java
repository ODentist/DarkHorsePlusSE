package Com.ODentist.day15.HomeWork.Porperties;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Properties;

public class ReadPorperties {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        String str;
        Properties properties = new Properties();
        properties.load(new FileReader("D:\\JAVA_Code\\DarkHorsePlusSE\\Day15\\src\\Com\\ODentist\\day15\\HomeWork\\Porperties\\conf.properties"));

        System.out.println(properties);
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        Field username = personClass.getField("username");
        Field age = personClass.getField("age");
        Class<?> aClass = Class.forName("Com.ODentist.day15.HomeWork.Porperties.Person");
        String className = properties.getProperty("className");
        Field name = personClass.getField("name");
        Field password = personClass.getField("password");
        username.set(person,properties.getProperty("username"));
        age.set(person,Integer.parseInt(properties.getProperty("age")));
        name.set(person,properties.getProperty("name"));
        password.set(person,properties.getProperty("password"));



        System.out.println(person);
    }
}
