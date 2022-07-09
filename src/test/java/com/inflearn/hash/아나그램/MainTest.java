package com.inflearn.hash.아나그램;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(main.solution("AbaAeCe", "baeeACA"), "YES");
    }

    @Test
    void solution2() {
        Main main = new Main();
        Assertions.assertEquals(main.solution("abaCC", "Caaab"), "NO");
    }
}