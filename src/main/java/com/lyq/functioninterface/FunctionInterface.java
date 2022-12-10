package com.lyq.functioninterface;


import java.util.function.Consumer;

public class FunctionInterface {
    public static void main(String[] args) {
        fun1((arr) -> {
            int sum = 0;
            for (int j : arr) {
                sum += j;
            }
            return sum;
        });
    }

    public static void fun1(Operator operator) {
        int[] arr = {1, 2, 3, 4};
        int sum = operator.getSum(arr);
        System.out.println("sum =" + sum);
    }

    public static void func2(Consumer consumer){
        consumer.accept(FunctionalInterface.class);
    }
}

/**
 * 函数式接口
 */
interface Operator {
    int getSum(int[] arr);
}
