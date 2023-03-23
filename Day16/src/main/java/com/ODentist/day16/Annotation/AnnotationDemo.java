package com.ODentist.day16.Annotation;

import org.junit.Test;

import java.lang.reflect.Method;

public class AnnotationDemo {
    @Test
    public void testAnnotationDemo() throws NoSuchMethodException {
        Class<TestMyAnnotation> ann = TestMyAnnotation.class;
        if (ann.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation an = ann.getDeclaredAnnotation(MyAnnotation.class);
            System.out.println(an.a());
            System.out.println(an.b());
            System.out.println(an.c());
            System.out.println(an.value());
        }
        System.out.println("===========");

        Method show = ann.getDeclaredMethod("show");
        if (show.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation declaredAnnotation = show.getDeclaredAnnotation(MyAnnotation.class);
            System.out.println(declaredAnnotation);
        }
    }
}
