package Strategy.sample;


public class BubbleSorter {
    private Comparator comparator;

    public BubbleSorter(Comparator comparator) {
        this.comparator = comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }


    public Object[] sotr(Object[] input) {
        Object[] result = new Object[input.length];
        System.arraycopy(input, 0, result, 0, input.length);

        for (int count = 0; count < result.length - 1; count++) {
            for (int i = 0; i < result.length - 1 - count; i++) {

                if (comparator.compare(result[i], result[i + 1])) {
                    Object swap = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = swap;
                }

            }

        }

        return result;

    }

}
