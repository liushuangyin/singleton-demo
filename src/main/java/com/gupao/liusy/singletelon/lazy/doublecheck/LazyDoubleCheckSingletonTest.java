package com.gupao.liusy.singletelon.lazy.doublecheck;

public class LazyDoubleCheckSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new LazyDoubleCheckExectorThread());
        Thread thread2 = new Thread(new LazyDoubleCheckExectorThread());
        thread1.start();
        thread2.start();
    }
}
