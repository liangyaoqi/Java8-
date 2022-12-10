package com.lyq.lambda;

import org.junit.jupiter.api.Test;

/**
 * lambda表达式原理
 *      在类中新增一个方法，这个方法的方法体就是lambda表达式中的代码
 *      还会形成一个匿名内部类，实现接口，重写抽象方法
 *      在接口中重写方法会调用新生成的方法
 */
public class LambdaTest {
    @Test
    public void test1() {
        People people = new People();
        people.goSwimming(() -> {
            System.out.println("i can swimming");
        });
    }
}
