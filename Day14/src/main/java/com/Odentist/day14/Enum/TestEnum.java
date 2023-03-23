package com.Odentist.day14.Enum;

public class TestEnum {
    public static void main(String[] args) {
        showGender(Gender.BOY);
    }

    public static void showGender(Gender gender) {
        switch (gender) {
            case BOY:
                System.out.println("book1");
                System.out.println("book2");
                break;
            case GIRL:
                System.out.println("book3");
                System.out.println("book4");
                break;
        }
    }
}
