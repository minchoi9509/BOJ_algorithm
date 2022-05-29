import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(2, main.solution("Computercooler", "c".charAt(0)));
    }
}