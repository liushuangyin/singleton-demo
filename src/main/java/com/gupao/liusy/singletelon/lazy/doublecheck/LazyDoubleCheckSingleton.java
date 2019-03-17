package com.gupao.liusy.singletelon.lazy.doublecheck;

/**
 * @author liusy
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){}


    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton != null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //CPU执行时会转换为JVM指令执行
                    //指令重排序的问题 valatile
                    //1、分配内存给这个对象
                    //2、初始化对象
                    //3、强这个初始化的对象和内存地址建立关联
                    //4、用户初次访问
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
