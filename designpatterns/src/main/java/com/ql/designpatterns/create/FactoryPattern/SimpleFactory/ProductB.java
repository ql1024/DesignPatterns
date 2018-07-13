package com.ql.designpatterns.create.FactoryPattern.SimpleFactory;

public class ProductB extends Product {
    @Override
    void show() {
        System.out.println(getClass().getSimpleName());
    }
}