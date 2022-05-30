import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("study", main.solution3("it is time to study"));
    }

    @Test
    void solution2() {
        Main main = new Main();
        Assertions.assertEquals("LKKJLJLJLKJLLLLLLL", main.solution3("dkjg LKKL KJkjglkd Kjgkd LKKJLJLJLKJLLLLLLL"));
    }
}