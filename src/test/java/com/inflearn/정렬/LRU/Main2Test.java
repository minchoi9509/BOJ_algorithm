package com.inflearn.정렬.LRU;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class Main2Test {

    @Test
    void solution() {
        Main2 main = new Main2();
        Assertions.assertEquals(main.solution(5, new int[]{1, 2, 3, 2, 6, 2, 3, 5, 7}), new int[]{7, 5, 3, 2, 6});
    }
}