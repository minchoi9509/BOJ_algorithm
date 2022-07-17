package com.inflearn.stackQueue.쇠막대기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(17, main.solution("()(((()())(())()))(())"));
    }

    @Test
    void solution2() {
        Main main = new Main();
        Assertions.assertEquals(24, main.solution("(((()(()()))(())()))(()())"));
    }
}