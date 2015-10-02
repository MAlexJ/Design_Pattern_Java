package Strategy.sample.impl;

import Strategy.sample.Comparator;

public class FirstLetterComparatorImpl implements Comparator {
    @Override
    public boolean compare(Object o1, Object o2) {
        return o1.toString().charAt(0)>o2.toString().charAt(0);
    }
}
