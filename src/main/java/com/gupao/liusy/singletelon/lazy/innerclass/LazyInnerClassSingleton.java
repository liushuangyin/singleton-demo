package com.gupao.liusy.singletelon.lazy.innerclass;

/**
 * @author liusy
 */
public class LazyInnerClassSingleton {

    //虽然构造方法私有了，但是逃不过反射的法眼
    private LazyInnerClassSingleton(){
        if (LazyHolder.LAZY != null){
            throw new RuntimeException("装逼，不允许构建实例");
        }
    }

    //懒汉式单例
    //LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美的避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance(){

        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
