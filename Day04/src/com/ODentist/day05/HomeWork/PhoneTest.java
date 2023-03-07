package com.ODentist.day05.HomeWork;

public class PhoneTest {
    public static void main(String[] args) {
        Phone.MobilePhone mp1 = new Phone().new MobilePhone("Apple", "白色", 8888.88);
        Phone.MobilePhone mp2 = new Phone().new MobilePhone("Huawei", "黑色", 5999.99);
        System.out.println(mp1);
        System.out.println(mp2);
    }
}
