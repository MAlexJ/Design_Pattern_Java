package FactoryMethod.classic.case_1.creator.impl;

import FactoryMethod.classic.case_1.creator.Creator;
import FactoryMethod.classic.case_1.product.Product;
import FactoryMethod.classic.case_1.product.impl.ConcreteProductA;

public class ConcreteCreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
