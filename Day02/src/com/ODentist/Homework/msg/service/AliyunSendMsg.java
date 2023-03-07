package com.ODentist.Homework.msg.service;

import com.ODentist.Homework.msg.domain.CheckCode;
import java.util.ArrayList;
import java.util.Random;

public class AliyunSendMsg extends SendMessage{

    // 存储短信验证码的集合
    public ArrayList<CheckCode> arrayList = new ArrayList<>() ;

    // 定义发送短信验证码时可选的数字字符
    public char[] chs = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9'} ;

    // 发送短信验证码的方法
    public void sendMsg(String phone) {

        // 补全代码
//        Random random = new Random();
//        ArrayList<Character> code = new ArrayList<>();
//        for (int i = 0; i < 4; i++) {
//            int i1 = random.nextInt(10);
//            code.add(chs[i1]);
//        }
        arrayList = sendMessage(phone,chs);
        print(arrayList);

    }

    @Override
    public void print(ArrayList<CheckCode>code) {
        System.out.print("访问阿里云短信平台给：" +code.get(0).getPhone()+"发送短信："+code.get(0).getCheckCode());
//        for (Character character : arrayList) {
//            System.out.print(character);
//        }
    }
}
