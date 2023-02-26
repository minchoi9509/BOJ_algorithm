package designpattern.singleton;

public class KnifeAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("칼 휘두르기");
    }
}
