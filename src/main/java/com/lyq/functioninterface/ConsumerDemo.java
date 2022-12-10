package com.lyq.functioninterface;

import java.util.function.Consumer;

/**
 * Consumer 接口
 * 有参数无返回值接口，用来消费数据的接口，需要指定参数泛型
 * 默认方法：andThen
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        toLowerCase(msg -> System.out.println(msg.toLowerCase()));

        testAndThen(msg1 -> System.out.println(msg1.toLowerCase()), msg2 -> System.out.println(msg2.substring(0,5)));
    }

    public static void toLowerCase(Consumer<String> consumer) {
        consumer.accept("HELLO WORLD");
    }

    public static void testAndThen(Consumer<String> consumer, Consumer<String> consumer2) {
        String str = "HELLO world";
        // consumer.accept(str);
        //consumer2.accept(str);

        // 使用andThen方法可以连续调用接口，实现跟流水线一样处理数据,使用多个andThen可以添加多个consumer处理
        consumer.andThen(consumer2).accept(str);

    }
}
