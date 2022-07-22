package com.inflearn.정렬.버블정렬;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(new int[]{5, 7, 11, 13, 15, 23}, main.solution(6, new int[]{13, 5, 11, 7, 23, 15}));
    }
}