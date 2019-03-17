package com.gupao.liusy.singletelon;

public class InnerClass {
        static {
            System.out.println("load class static...");
        }
        public InnerClass(){
            System.out.println("load class c...");
        }

        //静态内部类
        static class StaticInner {
            //static {
            //    System.out.println("load static inner class...");
            //}

             void staticInnerMethod() {
                System.out.println("static inner method...");
            }
        }

        public static void main(String[] args) {
            InnerClass outer = new InnerClass();      //此刻其内部类是否也会被加载？
            System.out.println("===========分割线===========");
            //InnerClass.StaticInner.staticInnerMethod();      //调用内部类的静态方法
            StaticInner staticInner = new StaticInner();
        }

}
