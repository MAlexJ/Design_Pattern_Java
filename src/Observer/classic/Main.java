package Observer.classic;

import Observer.classic.impl.ConcreteObservableImpl;
import Observer.classic.impl.ConcreteObserverA;
import Observer.classic.impl.ConcreteObserverB;
import Observer.classic.impl.ConcreteObserverC;

public class Main {

    public static void main(String[] args) {

        Observable observable = new ConcreteObservableImpl();
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        Observer observerC = new ConcreteObserverC();

        //add
        observable.addObserver(observerA);
        observable.addObserver(observerB);
        observable.addObserver(observerC);
        //notify
        observable.notifyObservers("Message");

        //remove
        observable.removeObserver(observerA);

        //notify
        observable.notifyObservers("Work");

    }
}
