package com.lyq.functioninterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.function.Supplier;

/**
 * Supplier 函数式接口的使用，用来生产数据
 * 无参有返回值的接口,对于lambda表达式需要提供一个返回数据的接口
 */
public class SupplierDemo {
    public static void main(String[] args) {
        getMax(() -> {
            int arr[] = {22, 34341, 5, 4, 234, 34};
            OptionalInt max = Arrays.stream(arr).max();
            System.out.println(max.getAsInt());
            return max.getAsInt();
        });
    }

    private static void getMax(Supplier<Integer> supplier) {
        supplier.get();
    }
}
