package com.inflearn.stackQueue.공주구하기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(7, main.solution(8, 3));
    }

    @Test
    void solution2() {
        Main main = new Main();
        Assertions.assertEquals(91, main.solution(100, 3));
    }
}