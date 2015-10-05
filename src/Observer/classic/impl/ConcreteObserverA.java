package Observer.classic.impl;

import Observer.classic.Observer;

public class ConcreteObserverA implements  Observer{
    @Override
    public void handEvent(Object obj) {
        System.out.println("ConcreteObserverA: "+ obj);
    }
}
