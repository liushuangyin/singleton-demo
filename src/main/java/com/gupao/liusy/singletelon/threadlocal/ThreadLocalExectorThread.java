package com.gupao.liusy.singletelon.threadlocal;

import com.gupao.liusy.singletelon.lazy.simple.LazySimpleSingleton;

public class ThreadLocalExectorThread implements Runnable{

    public void run() {
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
