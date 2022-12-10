package com.lyq.functioninterface;

import java.util.function.Predicate;

/**
 * predicate 断言判断函数式接口
 * test方法为判断逻辑接口，需自己实现（使用lambda）
 * 提供逻辑关系默认方法如 and or negate isEquals
 */
public class PredicateDemo {
    public static void main(String[] args) {
        predicateTest(msg -> msg.length() > 3, "hello world");

        predicateTest2(msg -> msg.contains("t"), msg -> msg.contains("o"));
    }

    public static void predicateTest(Predicate<String> predicate, String msg) {
        boolean b = predicate.test(msg);
        System.out.println("b:" + b);
    }

    public static void predicateTest2(Predicate<String> predicate1, Predicate<String> predicate2) {
        boolean isContains = predicate1.and(predicate2).test("hello");
        boolean orContains = predicate1.or(predicate2).test("world");
        System.out.println("both contains:" + isContains);
        System.out.println("or contains:" + orContains);
    }
}
