package designpattern.strategy;

public class FireBallAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("파이어볼 날리기");
    }
}
