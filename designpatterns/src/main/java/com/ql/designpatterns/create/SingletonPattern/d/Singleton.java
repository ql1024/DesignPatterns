package com.ql.designpatterns.create.SingletonPattern.d;

/**
 * Author: ql
 * Date: 2018/7/11
 * Desc: 同步锁(懒汉式改进)
 * 使用同步锁synchronized锁住创建单例的方法,防止多个线程同时调用.
 * 缺点:每次访问都要进行线程同步(即调用synchronized锁),造成过多的同步开销(加锁=耗时,耗能).
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton;

//    写法一
//    public static synchronized Singleton getSingleton() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    //    写法二
    public static Singleton getSingleton() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
}