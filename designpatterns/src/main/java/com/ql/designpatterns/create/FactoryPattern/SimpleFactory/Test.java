package com.ql.designpatterns.create.FactoryPattern.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        Factory.produce("A").show();
        Factory.produce("B").show();
        try {
            Factory.produce("C").show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("无该种产品");
        }
    }
}
