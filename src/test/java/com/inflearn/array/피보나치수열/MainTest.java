package com.inflearn.array.피보나치수열;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, main.solution(10));
    }
}