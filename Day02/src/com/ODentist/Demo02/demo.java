package com.ODentist.Demo02;

public class demo {
    public static void main(String[] args) {
        Animal a = new Dog();
        show(a);
    }
    public static void show(Animal  a){
        a.eat();
        if (a instanceof Cat)
        {
            Cat c=(Cat) a;
            c.catchMouse();
        }else if (a instanceof Dog){
            Dog d=(Dog) a;
            d.watchDog();
        }
    }
}
