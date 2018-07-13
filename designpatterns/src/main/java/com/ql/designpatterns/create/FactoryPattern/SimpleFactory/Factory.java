package com.ql.designpatterns.create.FactoryPattern.SimpleFactory;

/**
 * Author: ql
 * Date: 2018/7/13
 * Desc: 简单工厂(静态工厂)
 * 参考:https://www.jianshu.com/p/e55fbddc071c
 */
public class Factory {
    public static Product produce(String name) {
        switch (name) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}