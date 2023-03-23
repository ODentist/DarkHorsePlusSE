package Com.ODentist.day15.HomeWork.Porperties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;


public class Reflection2 {
    public static void main(String[] args) throws IOException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new BufferedReader(new FileReader("D:\\JAVA_Code\\DarkHorsePlusSE\\Day15\\src\\Com\\ODentist\\day15\\HomeWork\\Porperties\\conf.properties")));
        String className = properties.getProperty("className");
        Class<?> aClass1 = Class.forName(className);
        Constructor<?> declaredConstructor1 = aClass1.getDeclaredConstructor(String.class, String.class, String.class, int.class);
        Object o = declaredConstructor1.newInstance(properties.getProperty("username"), properties.getProperty("passowrd"), properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")));
        System.out.println(o);
//       Person person = new Person();
//        Set<Object> objects = properties.keySet();
//        for (Object object : objects) {
//            Object o = properties.get(object);
//        }
//        Set<String> names = new HashSet<>();
//        Class<? extends Person> personClass = person.getClass();
//        Field[] fields = personClass.getFields();
//        for (Field field : fields) {
//            String name = field.getName();
//            names.add(name);
//        }
//        for (Field field : personClass.getFields()) {
//            for (Object object : objects) {
//                Object o = properties.get(object);
//                if (field.equals(object))field.set(person,o);
//            }
//        }
//        System.out.println(person);
//
//        Class<? extends Properties> aClass = properties.getClass();
//
//        Constructor<? extends Properties> declaredConstructor = aClass.getDeclaredConstructor(String.class, String.class, String.class, int.class);
//        declaredConstructor.setAccessible(true);
//        declaredConstructor.newInstance(properties.getProperty("username"),properties.getProperty("passowrd"),properties.getProperty("name"),Integer.parseInt(properties.getProperty("age")));



    }
}
