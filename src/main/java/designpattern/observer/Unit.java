package designpattern.observer;

public abstract class Unit {
    int locationX = (int)Math.floor(Math.random() * 101);
    int locationY = (int)Math.floor(Math.random() * 101);
    int health;
    State state = State.ALIVE;

    AttackStrategy attackStrategy;
    MoveStrategy moveStrategy;

    public Unit(int health, AttackStrategy attackStrategy, MoveStrategy moveStrategy) {
        this.health = health;
        this.attackStrategy = attackStrategy;
        this.moveStrategy = moveStrategy;
    };

    @Override
    public String toString() {
        return "Unit{" +
                "locationX=" + locationX +
                ", locationY=" + locationY +
                ", health=" + health +
                ", state=" + state.getDesc() +
                ", attackStrategy=" + attackStrategy +
                ", moveStrategy=" + moveStrategy +
                '}';
    }

    public void attack() {
        attackStrategy.attack();
    };

    public void move(int x, int y) {
        moveStrategy.move(this, x, y);
    };

    public void moveAt(int locationX, int locationY) {
        moveStrategy.moveAt(this, locationX, locationY);
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void dead() {
        state = State.DEAD;
    }
}
