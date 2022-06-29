package com.inflearn.효율성.최대길이연속부분수열;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(main.solution(14, 2, new int[]{1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}), 8);
    }
}