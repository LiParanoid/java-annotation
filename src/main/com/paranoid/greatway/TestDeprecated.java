package com.paranoid.greatway;

/**
 * @author Paranoid
 * @create 2019-12-03 15:53
 */
public class TestDeprecated {
    public static void main(String[] args) {
        TestDeprecated testDeprecated = new TestDeprecated();
        testDeprecated.say();
        testDeprecated.run();
    }

    @Deprecated
    public void say(){
        System.out.println("say");
    }

    public void run(){
        System.out.println("run");
    }
}
