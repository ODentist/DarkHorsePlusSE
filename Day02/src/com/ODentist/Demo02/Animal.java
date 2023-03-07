package com.ODentist.Demo02;

public class Animal {
     private String nickname;
     public int age;

    public Animal() {

    }

    public Animal(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
         System.out.println("吃东西");

     }
}
