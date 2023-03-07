package com.ODentist.Homework.House;

public abstract class House {
    String wall;
    String door;
    String window;
    String ground;

    public House() {
    }

    public House(String wall, String door, String window, String ground) {
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.ground = ground;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }
    public void build() {
//        setWall("concrete");
//        setGround("marble");
//        setDoor("stealProof");
//        setWindow("east");
        System.out.println("house1 is using"+getGround());
        System.out.println("house1 is using"+getDoor());
        System.out.println("house1 is using"+getWall());
        System.out.println("house1 is using"+getWindow());
    }
    public abstract void show();
}
