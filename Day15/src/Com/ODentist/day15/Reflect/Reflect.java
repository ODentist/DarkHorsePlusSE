package Com.ODentist.day15.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> studentClass = Student.class;
        Constructor<?>[] declaredConstructors = Class.forName("Com.ODentist.day15.Reflect.Student").getDeclaredConstructors();
        //Student s=new Student(23,"张三");
        //Constructor<? extends Student> declaredConstructor = s.getClass().getDeclaredConstructor(int.class,String.class);
        String s1=studentClass.getName();
        //String s2=aClass.getName();
        //String s3=aClass1.getName();
        System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(s3);
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }
        //System.out.println(declaredConstructor);
        Constructor<Student> declaredConstructor1 = Student.class.getDeclaredConstructor(int.class,String.class);
        declaredConstructor1.setAccessible(true);
        Student lisi = declaredConstructor1.newInstance(15, "李四");
        System.out.println(lisi);



    }
}
