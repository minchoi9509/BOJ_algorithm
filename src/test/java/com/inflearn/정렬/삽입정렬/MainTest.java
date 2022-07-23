package com.inflearn.정렬.삽입정렬;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertArrayEquals(new int[]{5, 6, 7, 9, 10, 11}, main.solution(6, new int[]{11, 7, 5, 6, 10, 9}));
    }
}