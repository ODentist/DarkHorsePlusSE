package Com.ODentist.day15.HomeWork.StudentClassReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectStudent {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1
        Class<Student> studentClass = Student.class;
        //2
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class, int.class);
        Student student = declaredConstructor.newInstance("柳岩", 17);
        Method show = studentClass.getDeclaredMethod("show");
        show.invoke(student);

    }
}
