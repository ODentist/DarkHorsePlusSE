package Com.ODentist.day15.Reflect.ReflectionMemberMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Student> c = Student.class;
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+"________"+declaredMethod.getTypeParameters());
        }
        Method eat = c.getDeclaredMethod("eat");
        System.out.println(eat);

        Method eat1 = c.getDeclaredMethod("eat", String.class);
        System.out.println(eat1);

        System.out.println("=============");
        Student stu = new Student(13, "zhangsan");

        Object o = eat.invoke(stu);
        System.out.println(o);

        eat1.setAccessible(true);
        eat1.invoke(stu,"yu");

    }
}
