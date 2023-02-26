package designpattern.strategy;

public class Wizard extends Unit{
    public Wizard(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        super(health, attackStrategy, moveStrategy);
    }
}
