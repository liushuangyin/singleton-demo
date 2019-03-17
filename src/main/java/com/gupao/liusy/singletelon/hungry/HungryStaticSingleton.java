package com.gupao.liusy.singletelon.hungry;

/**
 * @author  liusy
 *
 */
public class HungryStaticSingleton {
    private static  final HungryStaticSingleton hungrySingleton;

    static{
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return  hungrySingleton;
    }
}
