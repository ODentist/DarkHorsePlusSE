package com.Odentist.Day12.HomeWork.Email;

public class Email implements Runnable{
        private  String email;

    public Email(String email) {
        this.email = email;
    }

    public Email() {

    }

    @Override
    public void run() {
        System.out.println("给"+email+"发邮件");
    }
}
