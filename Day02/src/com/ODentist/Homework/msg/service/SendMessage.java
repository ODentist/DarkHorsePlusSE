package com.ODentist.Homework.msg.service;

import com.ODentist.Homework.msg.domain.CheckCode;

import java.util.ArrayList;
import java.util.Random;

public abstract class SendMessage {

    public ArrayList<CheckCode> sendMessage(String phone,char []chs){
        CheckCode checkCode = new CheckCode();
        ArrayList<CheckCode> checkCodes = new ArrayList<>();
        Random random = new Random();
        StringBuffer code=new StringBuffer();
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(10);
            code.append(chs[i1]);
        }
        String s = code.toString();
        checkCode.setCheckCode(s);
        checkCode.setPhone(phone);
        checkCodes.add(checkCode);
        return checkCodes;
    }
    public abstract void print(ArrayList<CheckCode> c);

}
