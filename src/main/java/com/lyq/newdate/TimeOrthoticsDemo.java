package com.lyq.newdate;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 时间矫正器
 * 矫正时间如需将日期调整到下个月第一天等
 *
 * TemporalAdjuster:时间校正器
 * TemporalAdjusters：通过该类静态方法提供了大量常用的TemporalAdjuster的实现
 */
public class TimeOrthoticsDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        //将当前的日期调整到下个月的一号
        TemporalAdjuster adJuster = (temporal) -> {
            LocalDateTime dateTime = (LocalDateTime) temporal;
            LocalDateTime nextMouth = dateTime.plusMonths(1).withDayOfMonth(1);
            System.out.println(nextMouth);
            return nextMouth;
        };

        //通过自定义TemporalAdjusters来实现
        LocalDateTime nextMonth = now.with(adJuster);
        System.out.println(nextMonth);

        // 使用内置的实现
        LocalDateTime with = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
    }
}
