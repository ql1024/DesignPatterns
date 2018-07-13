package com.ql.designpatterns.create.SingletonPattern.e;

/**
 * Author: ql
 * Date: 2018/7/11
 * Desc: 双重检验锁(懒汉式改进)
 * 在同步锁的基础上,添加1层if判断:若单例已创建,则不需再执行加锁操作就可获取实例,从而提高性能.
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = null;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}