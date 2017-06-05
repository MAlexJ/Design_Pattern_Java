package Simple_Factory.case_01_interface;

import Simple_Factory.case_01_interface.example.Product;
import Simple_Factory.case_01_interface.example.ProductFactory;

/**
 * The simple example of using the pattern "Simply Factory"
 *
 * @author malex
 */
public class MainApp {

    public static void main(String[] args) {

        //Product A
        Product productA = ProductFactory.createProduct("A");
        System.out.println(productA.getSomething());

        //Product B
        Product productB = ProductFactory.createProduct("B");
        System.out.println(productB.getSomething());

    }
}