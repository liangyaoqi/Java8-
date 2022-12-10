package com.lyq.functionrefrence;

import java.util.Date;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 方法引用
 * 在lambada表达式中要执行的代码和我们定义的方法代码重复时，这时不用重写逻辑，直接引用方法就可以了
 */
public class FunctionReferenceTest2 {
    public static void main(String[] args) {
        // 对象名：：方法名
        Date date = new Date();
        Supplier<Long> supplier = () -> date.getTime();
        System.out.println(supplier.get());

        //方法引用
        Supplier<Long> supplier1 = date::getTime;

        //类名：：静态方法名
        Supplier<Long> supplier2 = System::currentTimeMillis;
        System.out.println(supplier2.get());

        //类名：：引用实例方法
        
    }
}
