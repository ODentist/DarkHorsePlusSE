package Com.ODentist.day15.HomeWork.EnhanceMod;

import java.lang.reflect.Field;

public class DoRefactor {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student(15, "zhangsan");
        setProperty(student,"name","lisi");
    }
    public static  void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = obj.getClass();
        Field field = aClass.getDeclaredField(propertyName);
        field.setAccessible(true);
        field.set(obj,value);
    }
}
