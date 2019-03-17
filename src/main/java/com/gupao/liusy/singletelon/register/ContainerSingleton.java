package com.gupao.liusy.singletelon.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liusy
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    //只控制了map自己本身内部是安全的
    private static Map<String,Object> ioc = new ConcurrentHashMap<String, Object>();
    public static Object getBean(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try{
                    obj =Class.forName(className);
                    ioc.put(className,obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }
}
