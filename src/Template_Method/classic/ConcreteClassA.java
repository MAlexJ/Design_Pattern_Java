package Template_Method.classic;

/**
 * Created by ION on 22.10.2015.
 */
public class ConcreteClassA extends AbstractClass {

    @Override
    protected Object algorithm_1() {
        return "A1";
    }

    @Override
    protected void algorithm_2(Object input) {
        System.out.println("A2 " + input);
    }

    @Override
    protected void algorithm_3() {
        System.out.println("A3");
    }

    @Override
    protected Object algorithm_4(Object input) {
        return "A4 " + input;
    }
}
