package Com.ODentist.day15.HomeWork.ReflectShow;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectShowMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<Demo> demoClass = Demo.class;
        Constructor<Demo> declaredConstructor = demoClass.getDeclaredConstructor();
        Demo demo = declaredConstructor.newInstance();
        demo.show("");
    }
}
