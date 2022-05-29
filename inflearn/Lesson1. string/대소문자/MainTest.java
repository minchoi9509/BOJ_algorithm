import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test()
    {
        Main main = new Main();
        Assertions.assertEquals("sTUdy", main.solution("StuDY"));
    }

    @Test
    void test2()
    {
        Main main = new Main();
        Assertions.assertEquals("sTUdy", main.solution2("StuDY"));
    }
}