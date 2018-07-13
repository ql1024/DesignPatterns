package com.ql.designpatterns.create.SingletonPattern.b;

/**
 * Author: ql
 * Date: 2018/7/11
 * Desc: 枚举(饿汉式)
 * 单元素的枚举类型已经成为实现Singleton的最佳方法.
 * 参考:https://upload-images.jianshu.io/upload_images/944365-bdccdb7827be2eb8.jpg
 */
public enum Singleton {
    SINGLETON;

    public int i;

    public void method() {
        System.out.println(i);
    }
}