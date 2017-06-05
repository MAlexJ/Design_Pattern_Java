package FactoryMethod.classic.interface_imp;

import FactoryMethod.classic.interface_imp.creator.Creator;
import FactoryMethod.classic.interface_imp.product.Product;

class Client {

    //Abstract -> Creator, Product
    String process(String data, Creator creator){
        Product product = creator.createProduct();

        // something ............

        return product.process(data);

    }
}
