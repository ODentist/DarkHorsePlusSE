package Com.ODentist.day15.HomeWork.ConstructByReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StudentConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(int.class,String.class);
        Student zhangsan = declaredConstructor.newInstance(12, "zhangsan");
        System.out.println(zhangsan);
    }
}
