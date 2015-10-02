package Strategy.sample.impl;

import Strategy.sample.Comparator;

public class ToStringLenghtsComparatorImpl implements Comparator {
    @Override
    public boolean compare(Object o1, Object o2) {
        return o1.toString().length() > o2.toString().length();
    }
}
