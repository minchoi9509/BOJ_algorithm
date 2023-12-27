package com.inflearn.정렬.마구간정하기;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MainTest {

    @Test
    public void solution() {
        Main main = new Main();
        Assertions.assertEquals(3, main.solution(5, 3, new int[]{1, 2, 8, 4, 9}));
    }
}
