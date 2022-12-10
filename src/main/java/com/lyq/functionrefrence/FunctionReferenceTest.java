package com.lyq.functionrefrence;

import java.util.function.Consumer;

/**
 * 方法引用
 * 在lambada表达式中要执行的代码和我们定义的方法代码重复时，这时不用重写逻辑，直接引用方法就可以了
 *
 * 调用形式
 *      对象：：方法名
 *      类名：：静态方法
 *      类名：：普通方法
 *      new 类名：：new 调用的构造器
 *
 *  被引用的方法参数和接口中的抽象方法的参数一致
 *  当接口抽象方法有返回值时，被引用的方法也必须要有返回值
 */
public class FunctionReferenceTest {
    public static void main(String[] args) {
        printMax(a -> getTotal(a));
        // 方法引用
        printMax(FunctionReferenceTest::getTotal);

    }

    private static void printMax(Consumer<int[]> consumer) {
        int[] arr = {2, 4, 51, 13, 4, 12};
        consumer.accept(arr);
    }

    private static int getTotal(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
