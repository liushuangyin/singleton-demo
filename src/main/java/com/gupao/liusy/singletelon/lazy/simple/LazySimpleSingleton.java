package com.gupao.liusy.singletelon.lazy.simple;

/**
 * @author liusy
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){}

    //JDK 1.6之后对sunchronized性能优化了不少，不可避免还是有一定的性能问题
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
