package com.lyq.lambda;

import org.junit.jupiter.api.Test;

public class LambdaTest {
    @Test
    public void test1() {
        People people = new People();
        people.goSwimming(() -> {
            System.out.println("i can swimming");
        });
    }
}
