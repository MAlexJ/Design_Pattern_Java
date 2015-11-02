package Template_Method.classic;

/**
 * Created by ION on 22.10.2015.
 */
public class Main {

    public static void main(String[] args) {

        AbstractClass abstractClass_A = new ConcreteClassA();
        Object a1 = abstractClass_A.templateMethod("a");
        System.out.println(a1.toString());

        System.out.println("");

        AbstractClass abstractClass_B = new ConcreteClassB();
        Object a2 = abstractClass_B.templateMethod("b");
        System.out.println(a2.toString());

    }

}
