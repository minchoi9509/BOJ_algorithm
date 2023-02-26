package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Units {
    private static List<Unit> units = null;

    public static List<Unit> getInstance() {
        if (units == null) {
            units = new ArrayList<Unit>();
        }
        return units;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Unit unit : units) {
            stringBuilder.append(unit);
        }
        return stringBuilder.toString();
    }
}
