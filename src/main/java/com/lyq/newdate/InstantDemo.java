package com.lyq.newdate;

import java.time.Instant;

/**
 * Instant类（时间戳/时间线），内部保存了从1970年1月1日 00：00：00以来的秒和纳秒
 */
public class InstantDemo {
    public static void main(String[] args) throws InterruptedException {
        //统计时间消耗
        Instant now = Instant.now();
        System.out.println(now);
        Thread.sleep(2000);
        Instant now1 = Instant.now();
        System.out.println("耗时 :"+(now1.getNano()-now.getNano()));
    }
}
