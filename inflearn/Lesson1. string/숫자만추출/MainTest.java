import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("208", main.solution("g0en2T0s8eSoft"));
        Assertions.assertEquals("1205", main.solution("tge0a1h205er"));
    }
}
