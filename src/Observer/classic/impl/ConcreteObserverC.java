package Observer.classic.impl;

import Observer.classic.Observer;

public class ConcreteObserverC implements Observer {
    @Override
    public void handEvent(Object obj) {
        System.out.println("ConcreteObserverB: " + obj + "  CCC  ");
    }
}
