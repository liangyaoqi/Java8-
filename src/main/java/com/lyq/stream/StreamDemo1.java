package com.lyq.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        //定义一个List集合
        List<String> list1 = Arrays.asList("xx", "lisi", "zhangnsan", "wangwu");
        list1.stream().filter(name->name.startsWith("zhang")).forEach(System.out::println);
    }
}
