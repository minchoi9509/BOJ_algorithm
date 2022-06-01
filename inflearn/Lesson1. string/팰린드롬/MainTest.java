
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("YES",  main.solution("found7, time: study; Yduts; emit, 7Dnuof"));
    }

    @Test
    void solution2() {
        Main main = new Main();
        Assertions.assertEquals("YES",  main.solution2("found7, time: study; Yduts; emit, 7Dnuof"));
    }
}
