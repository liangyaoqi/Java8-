package com.lyq.newdate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * Duration：用来计算两个时间差（LocalTime）
 * Period：用来计算两个日期差（LocalDate）
 */
public class DurationDemo {
    public static void main(String[] args) {
        //计算日期差
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2012, 3, 20);
        Period period = Period.between(ofDate, nowDate);
        System.out.println(period.getYears());

        //计算时间差
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(22, 12,30);
        Duration duration = Duration.between(nowTime, ofTime);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());

    }
}
