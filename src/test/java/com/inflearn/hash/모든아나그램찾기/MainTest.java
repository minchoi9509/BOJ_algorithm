package com.inflearn.hash.모든아나그램찾기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution() {
        Main main = new Main();
        Assertions.assertEquals(main.solution("bacaAacba", "abc"), 3);
    }
}