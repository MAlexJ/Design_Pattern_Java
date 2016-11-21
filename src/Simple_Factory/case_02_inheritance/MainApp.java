package Simple_Factory.case_02_inheritance;

import Simple_Factory.case_02_inheritance.example.AbstractProduct;
import Simple_Factory.case_02_inheritance.example.ProductFactory;

/**
 * @author malex
 */
public class MainApp {
    public static void main(String[] args) {

        //Product A
        AbstractProduct productA = ProductFactory.createProduct("A");
        System.out.println(productA.getSomething());

        //Product B
        AbstractProduct productB = ProductFactory.createProduct("B");
        System.out.println(productB.getSomething());

    }
}
