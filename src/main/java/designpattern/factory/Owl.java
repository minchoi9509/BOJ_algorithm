package designpattern.factory;

import java.util.List;

public class Owl extends Unit implements Subject {
    private List<Unit> unitsMemory;

    public Owl(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        super(health, attackStrategy, moveStrategy);
    }

    @Override
    public void registerObserver(Unit unit) {
        unitsMemory.add(unit);
    }

    @Override
    public boolean removeObserver(Unit unit) {
        return unitsMemory.remove(unit);
    }

    @Override
    public void discover() {
        for (Unit unit : unitsMemory) {

        }
    }
}
