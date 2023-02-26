package designpattern.singleton;

public class Citizen extends Unit {
    public Citizen(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        super(health, attackStrategy, moveStrategy);
    }
}
