package com.inflearn.string.중복문자제거;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void solution()
    {
        Main main = new Main();
        Assertions.assertEquals("kset", main.solution("ksekkset"));
    }

    @Test
    void solution2()
    {
        Main main = new Main();
        Assertions.assertEquals("kset", main.solution2("ksekkset"));
    }
}