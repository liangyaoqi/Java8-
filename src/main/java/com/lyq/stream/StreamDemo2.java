package com.lyq.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {
    public static void main(String[] args) {
        // 常用方法：filter、map、skip、sort、
        //终结类型：forEach、count，执行终结方法之后不再支持链式调用

        //分组，通过collect（Collectors.groupBy(s->s.x))之后可以分组

        //并行流，可以通过list.parallelStream获得
        // 或者将一个已有的流转换成并行流  Stream.of(1,2,3).parallel()

    }



}
