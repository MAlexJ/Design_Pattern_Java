package FactoryMethod.classic.interface_imp.creator.impl;

import FactoryMethod.classic.interface_imp.creator.Creator;
import FactoryMethod.classic.interface_imp.product.Product;
import FactoryMethod.classic.interface_imp.product.impl.ConcreteProductB;

public class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
