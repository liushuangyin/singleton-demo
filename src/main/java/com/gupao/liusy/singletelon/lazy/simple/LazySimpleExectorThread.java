package com.gupao.liusy.singletelon.lazy.simple;

public class LazySimpleExectorThread implements Runnable{

    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
