package com.lyq.lambda;

/**
 * 默认方法通过实例调用，静态方法通过接口名调用
 * 默认方法可以被继承，实现类可以直接调用接口默认方法，也可以重写接口默认方法
 * 静态方法不能被继承，实现类不能重写接口的静态方法，只能接口名调用
 */
@FunctionalInterface
public interface Swimming {
   String name = "xxx";

    void swimming();

    default void say(){
        System.out.println("saySomething");
    }

    static void test3() {
        System.out.println("i am test3");
    }
}
