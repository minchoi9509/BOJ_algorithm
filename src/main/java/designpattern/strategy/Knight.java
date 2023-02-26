package designpattern.strategy;

public class Knight extends Unit{
    public Knight(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        super(health, attackStrategy, moveStrategy);
    }
}
