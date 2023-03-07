package com.ODentist.Homework.msg.service;

import com.ODentist.Homework.msg.domain.CheckCode;

import java.util.ArrayList;

public class TencentSendMsg extends SendMessage {

    // 存储短信验证码的集合
    public ArrayList<CheckCode> arrayList = new ArrayList<>();

    // 定义发送短信验证码时可选的数字字符
    public char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    // 发送短信验证码的方法
    public void sendMsg(String phone) {

        // 补全代码
        arrayList = sendMessage(phone,chs);
        print( arrayList);

    }

    @Override
    public void print(ArrayList<CheckCode> characters) {
//        StringBuffer stringBuffer = new StringBuffer();
//        for (CheckCode character : characters) {
//            stringBuffer.append(character.getCheckCode());
//        }
        String s = new String(characters.get(0).getCheckCode());
        System.out.print("访问TX云短信平台给：" + characters.get(0).getPhone() + "发送短信："+s);

        }
    }
