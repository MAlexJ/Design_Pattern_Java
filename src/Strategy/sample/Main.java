package Strategy.sample;


import Strategy.sample.impl.FirstLetterComparatorImpl;
import Strategy.sample.impl.ToStringLenghtsComparatorImpl;

import java.util.Arrays;

public class Main {
    private static BubbleSorter bubbleSorter;
    private static Comparator comparator;
    private static int id = 2;
    private static int id_set = 1;

    public static void main(String[] args) {

       //OCP
        switch (id) {
            case 1:
                comparator = new FirstLetterComparatorImpl();
                break;

            case 2:
                comparator = new ToStringLenghtsComparatorImpl();
                break;
        }

        bubbleSorter = new BubbleSorter(comparator);

        System.out.println(Arrays.toString(bubbleSorter.sotr(new Integer[]{5, 56, 2, 12, 35, 45, 0})));
        System.out.println(Arrays.toString(bubbleSorter.sotr(new String[]{"asc", "ds", "asd", "sssssss", "a", "fsag"})));
        System.out.println(Arrays.toString(bubbleSorter.sotr(new Boolean[]{true, true, false, true})));
        System.out.println(Arrays.toString(bubbleSorter.sotr(new String[]{"asc1", "d3s", "as8d", "ss6sssss", "a5", "fs9ag"})) + "\n");
        System.out.println("Completed work: " + comparator.getClass().getSimpleName() + "\n");


        // DI
        switch (id_set) {
            case 1:
                bubbleSorter.setComparator(new FirstLetterComparatorImpl());
                break;

            case 2:
                bubbleSorter.setComparator(new ToStringLenghtsComparatorImpl());
                break;
        }

        System.out.println(Arrays.toString(bubbleSorter.sotr(new Integer[]{5, 56, 2, 12, 35, 45, 0})));
        System.out.println(Arrays.toString(bubbleSorter.sotr(new String[]{"asc", "ds", "asd", "sssssss", "a", "fsag"})));
        System.out.println(Arrays.toString(bubbleSorter.sotr(new Boolean[]{true, true, false, true})));
        System.out.println(Arrays.toString(bubbleSorter.sotr(new String[]{"asc1", "d3s", "as8d", "ss6sssss", "a5", "fs9ag"})) + "\n");

    }
}
