package com.Odentist.day14.Enum.AbstructEnumTest;

public enum AETest {
    SPRING("春"){
        @Override
        public void show() {
            System.out.println("this is Spring");
        }
    };


    AETest(String s) {

    }

    public abstract void show();


}
