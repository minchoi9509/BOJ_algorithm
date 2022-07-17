package com.inflearn.stackQueue.교육과정설계;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("YES", main.solution("CBA", "CBDAGE"));
    }
}