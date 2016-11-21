package Simple_Factory.case_01_interface.example;

import Simple_Factory.case_01_interface.example.impl.ConctreteProductA;
import Simple_Factory.case_01_interface.example.impl.ConctreteProductB;

/**
 * The Simple Factory
 * It produces the product based on the type
 */
public class ProductFactory {

    /**
     * The method produces a product
     *
     * @param type the type of product
     * @return concrete product
     */
    public static Product createProduct(String type) {

        if (type.equals("A")) {
            return new ConctreteProductA();
        }

        if (type.equals("B")) {
            return new ConctreteProductB();
        }

        throw new UnsupportedOperationException("The type: " + type + " is incorrect!");
    }

}
