package com.inflearn.array.큰수출력;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("7 9 6 12 ", main.solution(6, "7 3 9 5 6 12"));
    }

    @Test
    void solution2() {
        Main main = new Main();
        Assertions.assertEquals("7 10 6 7 9 20 15 ", main.solution(12, "7 3 10 9 5 6 7 9 20 19 12 15"));
    }

}