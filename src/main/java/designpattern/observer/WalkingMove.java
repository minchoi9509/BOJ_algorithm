package designpattern.observer;

public class WalkingMove implements MoveStrategy {
    @Override
    public void move(Unit unit, int x, int y) {
        moveAt(unit, unit.getLocationX() + x, unit.getLocationY() + y);
    }

    @Override
    public void moveAt(Unit unit, int locationX, int locationY) {
        if (isMovable(locationX, locationY)) {
            unit.setLocationX(locationX);
            unit.setLocationY(locationY);

            System.out.println("걸어서 위치로 가는 중 ...");
        }
        else
        {
            System.out.println("갈 수 없는 위치입니다");
        }
    }

    @Override
    public boolean isMovable(int locationX, int locationY) {
        return locationX < 100 && locationY < 100 && locationX > 0 && locationY > 0;
    }
}
