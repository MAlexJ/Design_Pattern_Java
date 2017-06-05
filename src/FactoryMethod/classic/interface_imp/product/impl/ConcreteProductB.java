package FactoryMethod.classic.interface_imp.product.impl;

import FactoryMethod.classic.interface_imp.product.Product;

public class ConcreteProductB implements Product {

    @Override
    public String process(String data) {
        return String.format("ConcreteProductB: %s",data);
    }
}
