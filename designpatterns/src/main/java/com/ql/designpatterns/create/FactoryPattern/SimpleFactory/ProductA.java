package com.ql.designpatterns.create.FactoryPattern.SimpleFactory;

public class ProductA extends Product {
    @Override
    void show() {
        System.out.println(getClass().getSimpleName());
    }
}