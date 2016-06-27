package FactoryMethod.classic.case_1.product.impl;

import FactoryMethod.classic.case_1.product.Product;

public class ConcreteProductB implements Product {

    @Override
    public String process(String data) {
        return String.format("ConcreteProductB: %s",data);
    }
}
