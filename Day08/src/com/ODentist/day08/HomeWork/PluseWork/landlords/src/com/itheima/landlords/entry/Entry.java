package com.ODentist.day08.HomeWork.PluseWork.landlords.src.com.itheima.landlords.entry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Entry {

    public static void main(String[] args) {

        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        List<String> broker = new ArrayList<>();

        /*往牌盒里装牌
         * ♦♣♥♠
         * */
        //定义花色数组
        String[] colors = {"♦" , "♣" , "♥" , "♠" };

        //定义点数数组
        String[] numbers = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A"};

        //拼接让每个花色都有13张从2-A的牌
        for (String color : colors) {
            for (String number : numbers) {
                broker.add(color+number);
            }
        }

        //加入大小王
        broker.add("小王");
        broker.add("大王");

        // 洗牌，打乱集合中的元素
        Collections.shuffle(broker);

        // 补全代码
        int size = broker.size();
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> LastOF = new ArrayList<>();
//        Random random = new Random();
//        while (size!=0) {
//            int i = random.nextInt(size);
//            player1.add(broker.get(i));
//            broker.remove(i);
//            size--;
//        }
        System.out.print("player1: ");
        distributeBroker(broker,player1, broker.size());
        System.out.print("player2: ");
        distributeBroker(broker,player2, broker.size());
        System.out.print("player3: ");
        distributeBroker(broker,player3, broker.size());
        System.out.print("last of the brokers is:");
        System.out.println(broker);


    }
    public static void distributeBroker(List<String> broker,List<String>player,int size){
        Random random = new Random();
        for (int i = 0; i < 17; i++) {
            int j=random.nextInt(broker.size());
            player.add(broker.get(j));
            broker.remove(j);
        }
        System.out.println(player);
    }

}
