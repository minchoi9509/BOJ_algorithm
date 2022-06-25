package com.inflearn.효율성.최대매출;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        assertEquals(main.solution(10, 3, new int[]{12, 15, 11, 20, 25, 10, 20, 19, 13, 15}), 56);
    }

}