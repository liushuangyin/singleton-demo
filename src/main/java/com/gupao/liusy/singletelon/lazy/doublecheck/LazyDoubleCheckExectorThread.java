package com.gupao.liusy.singletelon.lazy.doublecheck;

public class LazyDoubleCheckExectorThread implements Runnable{

    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
