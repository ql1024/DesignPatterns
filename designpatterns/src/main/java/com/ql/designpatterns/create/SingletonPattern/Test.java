package com.ql.designpatterns.create.SingletonPattern;

/**
 * Author: ql
 * Date: 2018/7/11
 * Desc: 测试类
 * 参考:https://www.jianshu.com/p/b8c578b07fbc
 */
public class Test {
    public static void main(String[] args) {
        com.ql.designpatterns.create.SingletonPattern.a.Singleton singleton_a1 = com.ql.designpatterns.create.SingletonPattern.a.Singleton.getSingleton();
        com.ql.designpatterns.create.SingletonPattern.a.Singleton singleton_a2 = com.ql.designpatterns.create.SingletonPattern.a.Singleton.getSingleton();
        System.out.println(singleton_a1 == singleton_a2);

        com.ql.designpatterns.create.SingletonPattern.b.Singleton singleton_b1 = com.ql.designpatterns.create.SingletonPattern.b.Singleton.SINGLETON;
        com.ql.designpatterns.create.SingletonPattern.b.Singleton singleton_b2 = com.ql.designpatterns.create.SingletonPattern.b.Singleton.SINGLETON;
        System.out.println(singleton_b1 == singleton_b2);
        com.ql.designpatterns.create.SingletonPattern.b.Singleton.SINGLETON.method();

        com.ql.designpatterns.create.SingletonPattern.c.Singleton singleton_c1 = com.ql.designpatterns.create.SingletonPattern.c.Singleton.getInstance();
        com.ql.designpatterns.create.SingletonPattern.c.Singleton singleton_c2 = com.ql.designpatterns.create.SingletonPattern.c.Singleton.getInstance();
        System.out.println(singleton_c1 == singleton_c2);
    }
}