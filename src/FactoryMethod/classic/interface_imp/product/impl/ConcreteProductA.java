package FactoryMethod.classic.interface_imp.product.impl;

import FactoryMethod.classic.interface_imp.product.Product;

public class ConcreteProductA implements Product {

    @Override
    public String process(String data) {
        return String.format("ConcreteProductA: %s",data);
    }
}
