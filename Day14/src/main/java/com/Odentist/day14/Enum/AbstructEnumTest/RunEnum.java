package com.Odentist.day14.Enum.AbstructEnumTest;

public class RunEnum {
    public static void main(String[] args) {
        show(AETest.SPRING);
    }

    public static void show(AETest aeTest) {
        switch (aeTest) {
            case SPRING:
                AETest.SPRING.show();
                break;
        }

    }
}
