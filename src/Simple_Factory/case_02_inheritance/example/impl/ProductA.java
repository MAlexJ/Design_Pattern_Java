package Simple_Factory.case_02_inheritance.example.impl;

import Simple_Factory.case_02_inheritance.example.AbstractProduct;

/**
 * Concrete product A
 */
public class ProductA extends AbstractProduct {

    @Override
    public String getSomething() {
        return "Product A: " + getLogic();
    }
}
