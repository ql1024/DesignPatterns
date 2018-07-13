package com.ql.designpatterns.create.SingletonPattern.f;

/**
 * Author: ql
 * Date: 2018/7/11
 * Desc: 静态内部类(懒汉)
 * 根据静态内部类的特性,解决了按需加载,线程安全的问题,同时实现简洁.
 * 按需加载:在静态内部类里创建单例,在装载该内部类时才会去创建单例.
 * 线程安全:类是由JVM加载,而JVM只会加载1遍,保证只有1个单例.
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = null;

    private static class Internal {
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getSingleton() {
        return Internal.singleton;
    }
}