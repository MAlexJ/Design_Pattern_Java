package Observer.classic.impl;

import Observer.classic.Observable;
import Observer.classic.Observer;

import java.util.Collection;
import java.util.LinkedList;

public class ConcreteObservableImpl implements Observable {

    private Collection<Observer> collection = new LinkedList<>();

    @Override
    public void addObserver(Observer obs) {
        this.collection.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        this.collection.remove(obs);
    }

    @Override
    public void notifyObservers(Object ob) {
        for (Observer iter : collection) {
            iter.handEvent(ob);
        }
    }
}
