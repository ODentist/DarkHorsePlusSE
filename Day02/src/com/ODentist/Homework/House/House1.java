package com.ODentist.Homework.House;

public class House1 extends House implements Alter{
public String name;

    public House1() {
    }

    public House1(String wall, String door, String window, String ground, String name) {
        super(wall, door, window, ground);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(getDoor()+getWindow()+getWall()+getGround()+getName());
    }

    @Override
    public void warning() {
        System.out.println(getDoor()+"warning");
    }
}
