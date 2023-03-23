package Com.ODentist.day15.HomeWork;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectArrayList {
    public static void main(String[] args) throws  InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1111);
        ReflectList(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(integers);
    }
    public static void ReflectList(ArrayList<Integer> arrayList) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends ArrayList> aClass = arrayList.getClass();
        Method add = aClass.getDeclaredMethod("add",Object.class);
        add.setAccessible(true);
        add.invoke(arrayList,"String");
    }
}
