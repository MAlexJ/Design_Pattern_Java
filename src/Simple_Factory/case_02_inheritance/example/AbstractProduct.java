package Simple_Factory.case_02_inheritance.example;

/**
 * Implementation of the product abstract class
 *
 * @author malex
 */
public abstract class AbstractProduct {

    /**
     * Default method of class
     *
     * @return string
     */
    protected String getLogic() {
        return "Logic Abstract Class: ";
    }

    /**
     * Abstract method
     *
     * @return the something string
     */
     public abstract String getSomething();
}
