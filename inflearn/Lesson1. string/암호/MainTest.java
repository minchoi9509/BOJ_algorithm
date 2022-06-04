
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("COOL", main.solution(4,"#****###**#####**#####**##**"));
    }

    @Test
    void solution2() {
        Main main = new Main();
        Assertions.assertEquals("COOL", main.solution2(4,"#****###**#####**#####**##**"));
    }
}
