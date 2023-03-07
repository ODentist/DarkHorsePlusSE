package com.ODentist.Homework.msg.entry;

import com.ODentist.Homework.msg.service.AliyunSendMsg;
import com.ODentist.Homework.msg.service.TencentSendMsg;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {

        // 请输入手机号码
        Scanner sc = new Scanner(System.in) ;
        System.out.print("请您输入登录的手机号码: ");
        String phone = sc.nextLine();

        // 调用发送短信类的方法发送短信验证码
        AliyunSendMsg aliyunSendMsg = new AliyunSendMsg() ;
        TencentSendMsg tencentSendMsg = new TencentSendMsg();
        tencentSendMsg.sendMsg(phone);
       // aliyunSendMsg.sendMsg(phone);

    }

}
