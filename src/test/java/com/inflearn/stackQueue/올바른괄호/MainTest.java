package com.inflearn.stackQueue.올바른괄호;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals("NO", main.solution("(()(()))(()"));
    }
}