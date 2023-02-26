package designpattern.singleton;

public interface MoveStrategy {
    void move(Unit unit, int x, int y);

    void moveAt(Unit unit, int locationX, int locationY);

    boolean isMovable(int locationX, int locationY);
}
