package Template_Method.classic;

public abstract class AbstractClass {

    public final Object templateMethod(Object input) {
        Object data = algorithm_1();
        algorithm_2(input);
        algorithm_3();
        Object data2 = algorithm_4(input);
        return data.toString() + " plus " + data2.toString();
    }

    protected Object algorithm_1() {
        return "default_algorithm";
    }

    protected abstract void algorithm_2(Object input);

    protected abstract void algorithm_3();

    protected abstract Object algorithm_4(Object input);
}
