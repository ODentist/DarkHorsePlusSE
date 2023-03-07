package com.ODentist.day05.Cite;

public class Cite {

    @FunctionalInterface
    public interface ImTheOne {
        String handleString(String a, String b);
    }

    static class OneClass {
        static String concatString(String a, String b) {
            return a + b;
        }
    }


    public static void main(String[] args) {
        ImTheOne theOne = OneClass::concatString;
        String result = theOne.handleString("abc", "def");
        System.out.println(result);

        //相当于以下效果，直接把类的静态方法写在Lambda体里
        ImTheOne theOne2 = (a, b) -> OneClass.concatString(a, b);
        String result2 = theOne2.handleString("123", "456");
        System.out.println(result2);

    }

}
