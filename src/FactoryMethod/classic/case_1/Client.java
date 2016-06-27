package FactoryMethod.classic.case_1;

import FactoryMethod.classic.case_1.creator.Creator;
import FactoryMethod.classic.case_1.product.Product;

class Client {

    //Abstract -> Creator, Product
    String process(String data, Creator creator){
        Product product = creator.createProduct();

        // something ............

        return product.process(data);

    }
}
