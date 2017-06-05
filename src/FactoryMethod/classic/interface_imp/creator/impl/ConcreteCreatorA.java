package FactoryMethod.classic.interface_imp.creator.impl;

import FactoryMethod.classic.interface_imp.creator.Creator;
import FactoryMethod.classic.interface_imp.product.Product;
import FactoryMethod.classic.interface_imp.product.impl.ConcreteProductA;

public class ConcreteCreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
