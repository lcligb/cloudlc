package com.example.cloudlc.dailyTest.test;

import com.example.cloudlc.utils.DateTimeUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {
        DateTimeUtils dateTimeUtils = new DateTimeUtils();
        Date date = new Date();
        System.out.println(date);
        ZonedDateTime zdt = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(zdt);
        //zdt加1分钟
        System.out.println(zdt.plusMinutes(1));
        System.out.println("---------------------------------------------------------");
        System.out.println(dateTimeUtils.dateToLocalDate(date));
        System.out.println(dateTimeUtils.dateToLocalDateTime(date));
        System.out.println(dateTimeUtils.getFirstDayOfMonth(LocalDate.now()));
    }

    public static void test1(){

    }
}
