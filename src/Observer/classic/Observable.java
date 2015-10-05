package Observer.classic;


public interface Observable {
    void addObserver(Observer obs);

    void removeObserver(Observer obs);

    void notifyObservers(Object ob);
}
