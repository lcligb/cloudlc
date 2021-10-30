package com.example.dailyTest.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest {
    private static final String FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        test1();
    }
    public static void test1(){
        SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
        try {
            Date parse1 = sdf.parse("2021-10-17 10:00:00");
            Date parse2 = sdf.parse("2021-10-17 11:00:00");
            long l = (parse1.getTime() - parse2.getTime()) / 1000;
            System.out.println(l);
            System.out.println("----------");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
