package designpattern.factory;

public class Citizen extends Unit implements Observer {
    public Citizen(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        super(health, attackStrategy, moveStrategy);
    }

    public Citizen(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy, Owl owl) {
        super(health, attackStrategy, moveStrategy);
        owl.registerObserver(this);
    }

    @Override
    public void discovered() {
        System.out.println("시민이 발견됬습니다 위치 [" + this.getLocationX() + ", " + this.getLocationY() + "]");
    }
}
