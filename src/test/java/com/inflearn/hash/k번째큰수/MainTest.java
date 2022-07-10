package com.inflearn.hash.k번째큰수;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(143, main.solution(10, 3, new int[] {13, 15, 34, 23, 45, 65, 33, 11, 26, 42}));
    }
}