package Simple_Factory.case_01_interface.example.impl;

import Simple_Factory.case_01_interface.example.Product;

/**
 * Implementation of the product interface
 */
public class ConctreteProductA implements Product {

    @Override
    public String getSomething() {
        return "ProductA";
    }
}
