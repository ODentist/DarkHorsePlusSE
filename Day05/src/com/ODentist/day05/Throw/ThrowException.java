package com.ODentist.day05.Throw;

public class ThrowException {
    public static void main(String[] args) {
    method();
    }
    public static void method(){
        //int [] a={11,22};
        //System.out.println(a[10]);
        throw  new ArrayIndexOutOfBoundsException();
    }
}
