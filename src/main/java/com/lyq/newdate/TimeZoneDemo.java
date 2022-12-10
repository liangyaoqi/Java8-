package com.lyq.newdate;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Java8中加入了对时区的支持，LocalDate、LocalTime、LocalDateTime是不带时区的，带时区的日期时间类分别为：ZonedDate
 * ZonedTime、ZonedDateTime
 * 每个时区都对应着ID，ID的格式为"区域/城市"。例如 Asia/Shanghai等
 * ZoneId：该类包含所有时区消息
 */
public class TimeZoneDemo {
    public static void main(String[] args) {
        // 获取所有的时区id
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);

        //获取当前时间 中国使用的东八区 比标准时间早8小时
        LocalDateTime now = LocalDateTime.now();
        //获取标准时间
        ZonedDateTime bz = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(bz);

        //使用指定的时区创建日期时间
        ZonedDateTime marigot = ZonedDateTime.now(ZoneId.of("America/Marigot"));
        System.out.println(marigot);
    }
}
