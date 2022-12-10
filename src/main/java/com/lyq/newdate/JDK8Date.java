package com.lyq.newdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

public class JDK8Date {
    public static void main(String[] args) {
        //创建指定日期
        LocalDate date1 = LocalDate.of(2022, 12, 10);
        System.out.println(date1);
        //得到当前日期
        LocalDate now = LocalDate.now();
        //获取日期信息
        int year = now.getYear();
        Month month = now.getMonth();
        int monthValue = month.getValue();


        //得到当前时间
        LocalTime nowTime = LocalTime.now();
        //得到指定时间
        LocalTime time1 = LocalTime.of(18, 28);
        //获取时间信息
        int hour = time1.getHour();
        int minute = time1.getMinute();
        System.out.println(now + "  " + nowTime);


        //修改时间和比较
        //修改时间
        LocalDate localDate = now.withYear(2020);
        LocalDate localDate2 = now.withMonth(2);
        System.out.println(localDate);
        //时间的加减
        //加
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime localDateTime1 = now1.plusDays(1);
        LocalDateTime localDateTime2 = now1.plusMonths(2);
        System.out.println(localDateTime1 + "  " + localDateTime2);
        //减
        LocalDateTime now2 = LocalDateTime.now();
        LocalDateTime localDateTime = now2.minusYears(2);
        System.out.println(localDateTime);
        //比较
        LocalDateTime now3 = LocalDateTime.now();
        LocalDateTime date = LocalDateTime.of(2012, 12, 9, 14, 23);
        if (now3.isAfter(date)) {
            //now3比date小
            System.out.println("xxx");
        } else if (now3.isBefore(date)){
            System.out.println("yyy");
        }

        //格式化时间
        //指定格式
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //将日期时间转换为字符串
        String format = now2.format(isoLocalDateTime);
        System.out.println(format);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = now2.format(dateTimeFormatter);
        System.out.println(format1);
    }
}
