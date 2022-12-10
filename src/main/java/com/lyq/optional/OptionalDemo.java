package com.lyq.optional;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String userName = null;
        if (userName != null) {
            System.out.println("字符串长度为:" + userName.length());
        } else {
            System.out.println("string is null");
        }

        //Optional类创建
        // 通过of方法创建,不支持null的值
        Optional<String> op1 = Optional.of("zhangsan");
        //ofNullable支持null值
        Optional<Object> op2 = Optional.ofNullable(null);
        //通过empty直接创建一个空的optional对象
        Optional<Object> op3 = Optional.empty();


        /**
         *常用方法
         *      get（）：如果Optional有值则返回，否则抛出NoSuchElementException
         *      isPresent():判断是否包含值，包含值返回ture，不包含值返回false
         *      orElse(T t):如果调用对象包含值就返回该值，否则返回t
         */

        //获取Optional的值
        String s = op1.get();
        System.out.println(s);
        Optional<String> name = Optional.ofNullable(userName);
        //给定一个值，为空就返回此值
        String lisi = name.orElse("lisi");
        System.out.println(lisi);
        //使用函数式接口传入lambda表达式
         name.orElseGet(() -> "xxx");
        System.out.println(s);
        //为空时抛出异常
//        op2.orElseThrow();


    }

    public static String getNameForOptional(Optional<Phone> op) {
        //方法为空则执行传入的consumer函数
        return "";
    }
}

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Phone {
    private String cpu;
    private String gpu;
}
