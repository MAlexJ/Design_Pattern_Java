package FactoryMethod.classic.case_1.creator.impl;

import FactoryMethod.classic.case_1.creator.Creator;
import FactoryMethod.classic.case_1.product.Product;
import FactoryMethod.classic.case_1.product.impl.ConcreteProductB;

public class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
