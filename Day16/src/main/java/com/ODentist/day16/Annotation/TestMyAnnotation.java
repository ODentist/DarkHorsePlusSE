package com.ODentist.day16.Annotation;

import org.junit.Test;

@MyAnnotation( value = "zhangsan", c = {"java", "python"})
public class TestMyAnnotation {
    @MyAnnotation(value = "lisi", b = false, c = {"javascript", "Html"})
    public void show(){

    }
}
