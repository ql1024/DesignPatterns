package com.ql.designpatterns.create.SingletonPattern.c;

/**
 * Author: ql
 * Date: 2018/7/11
 * Desc: 标准(懒汉式)
 * 多线程不安全
 * 参考:https://upload-images.jianshu.io/upload_images/944365-ba2f81731ede7035.png
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}