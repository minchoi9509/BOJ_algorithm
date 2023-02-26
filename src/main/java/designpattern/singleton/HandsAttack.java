package designpattern.singleton;

public class HandsAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("맨 손 때리기");
    }
}
