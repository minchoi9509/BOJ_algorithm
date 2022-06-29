package com.inflearn.효율성.연속부분수열;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(main.solution(8, 6, new int[]{1, 2, 1, 3, 1, 1, 1, 2}), 3);
    }

}