package Com.ODentist.day15.Reflect.TestReflection2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Student> c = Student.class;
        Field[] declaredFields = Student.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+"_______"+declaredField.getType());
        }
        System.out.println("======");
        Field name = c.getDeclaredField("name");
        System.out.println(name.getName()+"-----------"+name.getType());

        Student student = new Student("张三", 18);
        System.out.println("========");

        name.setAccessible(true);
        name.set(student,"李四");

        Object o = name.get(student);
        System.out.println(o);


    }

}
