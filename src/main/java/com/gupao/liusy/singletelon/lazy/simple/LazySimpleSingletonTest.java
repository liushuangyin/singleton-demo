package com.gupao.liusy.singletelon.lazy.simple;

public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new LazySimpleExectorThread());
        Thread thread2 = new Thread(new LazySimpleExectorThread());
        thread1.start();
        thread2.start();
    }
}
