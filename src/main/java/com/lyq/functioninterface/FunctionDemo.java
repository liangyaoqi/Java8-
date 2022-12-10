package com.lyq.functioninterface;

import java.util.function.Function;

/**
 * Function接口，根据一个类型的数据得到另一个类型的数据，前者称之为前置条件，后者称之为后置条件。有参数有返回值
 */
public class FunctionDemo {
    public static void main(String[] args) {
        // 传递进去一个字符串返回一个整型
        testFunction(msg -> {
            return Integer.parseInt(msg);
        });

        testFunction2(msg -> Integer.parseInt(msg), msg2 -> msg2 * 2);
    }

    public static void testFunction(Function<String, Integer> function) {
        Integer apply = function.apply("222");
        System.out.println(apply);
    }

    public static void testFunction2(Function<String, Integer> function, Function<Integer, Integer> function2) {
        //Integer i1 = function.apply("222");
        //Integer i2 = function2.apply(i1);
        Integer I = function.andThen(function2).apply("222");
        System.out.println("i = " + I);
    }
}