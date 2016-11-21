package Simple_Factory.case_02_inheritance.example.impl;

import Simple_Factory.case_02_inheritance.example.AbstractProduct;

/**
 * Concrete Product B
 */
public class ProductB extends AbstractProduct {

    @Override
    public String getSomething() {
        return "Product B: " + getLogic();
    }
}
