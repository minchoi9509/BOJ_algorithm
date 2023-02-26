package designpattern.observer;

public class Knight extends Unit implements Observer {
    public Knight(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        super(health, attackStrategy, moveStrategy);
    }

    public Knight(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy, Owl owl) {
        super(health, attackStrategy, moveStrategy);
        owl.removeObserver(this);
    }

    @Override
    public void discovered() {
        System.out.println("기사 발견됬습니다 위치 [" + this.getLocationX() + ", " + this.getLocationY() + "]");
    }
}
