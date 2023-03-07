package com.ODentist.day05.Clone;

import java.util.Arrays;

public class StudentClone implements Cloneable{
    private int id=1;
    private String name="zhangsan";
    private String password="12306";
    private double [] score=new double[]{99.5,88.0};

    public StudentClone(int id, String name, String password, double[] score) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.score = score;
    }

    public StudentClone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentClone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", score=" + Arrays.toString(score) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
