package com.lyq.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        //定义一个List集合
        List<String> list1 = Arrays.asList("xx", "lisi", "zhangnsan", "wangwu");
        list1.stream().filter(name->name.startsWith("zhang")).forEach(System.out::println);

        /**
         * stream流的获取方式
         *      根据Collection接口中的默认方法stream获取
         *      通过stream的of方法
         *      通过Arrays的stream方法
         *      如果是map可以通过获取key value的集合再获取stream
         */

    }



}
