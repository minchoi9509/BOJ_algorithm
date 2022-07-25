package com.inflearn.정렬.LRU;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(main.solution(5, new int[]{1, 2, 3, 2, 6, 2, 3, 5, 7}), new int[]{7, 5, 3, 2, 6});

    }
}