package com.ODentist.day08.HomeWork.Roommates;

import java.util.HashSet;

public class RoomTest {
    public static void main(String[] args) {
        HashSet<Mates> mates = new HashSet<>();
        mates.add(new Mates("赵丽颖",18));
        mates.add(new Mates("范冰冰",18));
        mates.add(new Mates("杨幂",19));
        mates.add(new Mates("杨幂",19));
        System.out.println(mates.toString());
    }
}
