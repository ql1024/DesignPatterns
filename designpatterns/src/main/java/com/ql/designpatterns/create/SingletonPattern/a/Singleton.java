package com.ql.designpatterns.create.SingletonPattern.a;

/**
 * Author: ql
 * Date: 2018/7/10
 * Desc: 标准(饿汉式)
 * 依赖JVM类加载机制,保证单例只会被创建1次(线程安全).
 * 1.JVM在类的初始化阶段(即在Class被加载后、被线程使用前),会执行类的初始化.
 * 2.在执行类的初始化期间,JVM会去获取一个锁.这个锁可以同步多个线程对同一个类的初始化.
 */
public class Singleton {
    //    私有化无参构造.
    private Singleton() {
    }

    //    加载该类时,单例就会自动被创建.
    private static Singleton singleton = new Singleton();

    //    静态方法获取单例.
    public static Singleton getSingleton() {
        return singleton;
    }
}