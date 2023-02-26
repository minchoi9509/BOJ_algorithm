package designpattern.observer;

public class Wizard extends Unit implements Observer {
    public Wizard(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        super(health, attackStrategy, moveStrategy);
    }

    public Wizard(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy, Owl owl) {
        super(health, attackStrategy, moveStrategy);
        owl.removeObserver(this);
    }

    @Override
    public void discovered() {
        System.out.println("마법사 발견됬습니다 위치 [" + this.getLocationX() + ", " + this.getLocationY() + "]");
    }
}
