package com.inflearn.정렬.이분검색;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(3, main.solution2(32, new int[]{23, 87, 65, 12, 57, 32, 99, 81}));
    }
}