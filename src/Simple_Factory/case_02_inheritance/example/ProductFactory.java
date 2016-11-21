package Simple_Factory.case_02_inheritance.example;

import Simple_Factory.case_02_inheritance.example.impl.ProductA;
import Simple_Factory.case_02_inheritance.example.impl.ProductB;

/**
 * The simple example if using the pattern "Simply Factory"
 *
 * @author malex
 */
public class ProductFactory {

    public static AbstractProduct createProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        }

        if (type.equals("B")) {
            return new ProductB();
        }

        throw new IllegalArgumentException("The type: " + type + " is incorrect!");

    }

}
