package com.example.cloudlc.dailyTest.test;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        //建牌
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"红桃","黑桃","梅花","方片"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3",};
        for (String color:colors) {
            for (String number:numbers) {
                poker.add(color+number);
            }
        }
        poker.add("大王");
        poker.add("小王");
        //洗牌
        Collections.shuffle(poker);
        //发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i>50){
                dipai.add(p);
            }else if (i%3==0){
                player01.add(p);
            }else if (i%3==1){
                player02.add(p);
            }else if (i%3==2){
                player03.add(p);
            }
        }
        System.out.println("玩家1:"+player01);
        System.out.println("玩家2:"+player02);
        System.out.println("玩家3:"+player03);
        System.out.println("底牌:"+dipai);



    }
}
