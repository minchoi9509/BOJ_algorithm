package designpattern.observer;

interface Subject {
    void registerObserver(Unit unit);
    boolean removeObserver(Unit unit);
    void discover();
}
