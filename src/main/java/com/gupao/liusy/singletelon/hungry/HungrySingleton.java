package com.gupao.liusy.singletelon.hungry;

/**
 * @author  liusy
 *
 */
public class HungrySingleton {
    private static  final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return  hungrySingleton;
    }
}
