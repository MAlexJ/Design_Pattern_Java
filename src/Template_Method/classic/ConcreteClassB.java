package Template_Method.classic;

/**
 * Created by ION on 22.10.2015.
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    protected void algorithm_2(Object input) {
        System.out.println("B2 " + input);
    }

    @Override
    protected void algorithm_3() {
        System.out.println("B3");
    }

    @Override
    protected Object algorithm_4(Object input) {
        return "B4 " + input;
    }
}
